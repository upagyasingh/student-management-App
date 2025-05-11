package chatbot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

public class ChatAssistantApp extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private JButton sendToAuthorityButton;

    public ChatAssistantApp() {
        setTitle("Chat Assistant");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 🟦 Microsoft-style Top Panel
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(0, 120, 215));
        topPanel.setPreferredSize(new Dimension(600, 50));
        JLabel titleLabel = new JLabel("Chat Assistant");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        topPanel.add(titleLabel);

        // 📝 Chat area
        chatArea = new JTextArea();
        chatArea.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);

        // ⌨️ Input panel
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        inputField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        sendButton = new JButton("Ask");
        sendToAuthorityButton = new JButton("Ask the Authority");
        inputPanel.add(inputField, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(sendButton);
        buttonPanel.add(sendToAuthorityButton);
        inputPanel.add(buttonPanel, BorderLayout.EAST);

        // 📩 Send action
        sendButton.addActionListener(e -> handleSend());
        inputField.addActionListener(e -> handleSend());

        // 📤 Authority action
        sendToAuthorityButton.addActionListener(e -> sendToAuthority());

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void handleSend() {
        String message = inputField.getText().trim();
        if (message.isEmpty()) return;

        chatArea.append("You: " + message + "\n");
        inputField.setText("");
        chatArea.append("Assistant: Thinking...\n");

        new Thread(() -> {
            String reply = getAssistantReply(message);
            SwingUtilities.invokeLater(() -> {
                chatArea.append("Assistant: " + reply + "\n\n");
            });
        }).start();
    }

    // 🌐 Gemini API Call
    private String getAssistantReply(String userInput) {
        try {
            String apiKey = "AIzaSyBNdtStnixHe5AIw0eDucTHO6Bn6SkYbY4";
            URL url = new URL("https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=" + apiKey);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");

            String jsonInput = """
            {
                "contents": [
                    {
                        "role": "user",
                        "parts": [
                            { "text": "%s" }
                        ]
                    }
                ]
            }
            """.formatted(userInput.replace("\"", "\\\""));

            try (OutputStream os = conn.getOutputStream()) {
                os.write(jsonInput.getBytes("utf-8"));
            }

            InputStream responseStream = conn.getInputStream();
            String responseJson = new String(responseStream.readAllBytes());

            // ✅ Parse with org.json
            JSONObject json = new JSONObject(responseJson);
            JSONArray candidates = json.getJSONArray("candidates");
            JSONObject content = candidates.getJSONObject(0).getJSONObject("content");
            JSONArray parts = content.getJSONArray("parts");
            return parts.getJSONObject(0).getString("text");

        } catch (Exception e) {
            return "⚠️ Error: " + e.getMessage();
        }
    }
   private void sendToAuthority() {
        String authorityMessage = JOptionPane.showInputDialog(null, "Enter your message for the authority:");
        if (authorityMessage != null && !authorityMessage.trim().isEmpty()) {
            try {
                EmailService.sendEmail(
                    "upagyasinght48@gmail.com",
                    "Student Message from ChatBot",
                    authorityMessage
                );
                JOptionPane.showMessageDialog(null, "Message sent to authority successfully ✅");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed to send message ❌");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Message cannot be empty!");
        }
    }

   
}
