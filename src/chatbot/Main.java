// package chatbot;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// import java.io.*;
// import java.net.*;
// import java.util.*;
// import javax.net.ssl.HttpsURLConnection;
// import org.json.JSONArray;
// import org.json.JSONObject;

// public class Main {
//     private static final String API_KEY = ""; // 🔐 Environment variable
//     private static final String API_URL = "https://api.openai.com/v1/chat/completions";

//     private JTextArea chatArea;
//     private JTextArea inputArea;
//     private JButton sendButton;
//     private JButton sendToAuthorityButton;

//     private final java.util.List<JSONObject> messageHistory = new ArrayList<>(); // 🧠 Retain history

//     public Main() {
//         JFrame frame = new JFrame("Student Management ChatBot");

//         frame.setSize(600, 500);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLocationRelativeTo(null);

//         frame.getRootPane().setBorder(BorderFactory.createLineBorder(new Color(173, 216, 230), 5));
//         frame.getContentPane().setBackground(new Color(245, 245, 245));

//         JPanel headerPanel = new JPanel();
//         headerPanel.setBackground(new Color(240, 240, 240));
//         JLabel titleLabel = new JLabel("Student Management ChatBot");
//         titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
//         titleLabel.setForeground(new Color(60, 60, 60));
//         headerPanel.add(titleLabel);

//         chatArea = new JTextArea();
//         chatArea.setEditable(false);
//         chatArea.setFont(new Font("Arial", Font.PLAIN, 14));
//         chatArea.setBackground(Color.WHITE);
//         chatArea.setLineWrap(true);
//         chatArea.setWrapStyleWord(true);
//         JScrollPane scrollPane = new JScrollPane(chatArea);

//         inputArea = new JTextArea(4, 20);
//         inputArea.setLineWrap(true);
//         inputArea.setWrapStyleWord(true);
//         JScrollPane inputScroll = new JScrollPane(inputArea);
//         inputArea.setFont(new Font("Arial", Font.PLAIN, 14));

//         sendButton = new JButton("Send");
//         sendButton.setBackground(new Color(100, 149, 237));
//         sendButton.setForeground(Color.WHITE);
//         sendButton.setFont(new Font("Arial", Font.BOLD, 14));
//         sendButton.addActionListener(e -> {
//             sendButton.setEnabled(false); // 🚫 Prevent spamming
//             sendMessage();
//             sendButton.setEnabled(true);
//         });

//         sendToAuthorityButton = new JButton("Send to Authority");
//         sendToAuthorityButton.setBackground(new Color(255, 102, 102));
//         sendToAuthorityButton.setForeground(Color.WHITE);
//         sendToAuthorityButton.setFont(new Font("Arial", Font.BOLD, 13));
//         sendToAuthorityButton.addActionListener(e -> sendToAuthority());

//         JPanel bottomPanel = new JPanel(new BorderLayout());
//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//         buttonPanel.add(sendToAuthorityButton);
//         buttonPanel.add(sendButton);

//         bottomPanel.add(inputScroll, BorderLayout.CENTER);
//         bottomPanel.add(buttonPanel, BorderLayout.SOUTH);

//         frame.setLayout(new BorderLayout());
//         frame.add(headerPanel, BorderLayout.NORTH);
//         frame.add(scrollPane, BorderLayout.CENTER);
//         frame.add(bottomPanel, BorderLayout.SOUTH);

//         frame.setVisible(true);
//     }

//     private void sendMessage() {
//         String userMessage = inputArea.getText().trim();
//         if (!userMessage.isEmpty()) {
//             chatArea.append("You: " + userMessage + "\n");
//             inputArea.setText("");

//             JSONObject userMsgJson = new JSONObject();
//             userMsgJson.put("role", "user");
//             userMsgJson.put("content", userMessage);
//             messageHistory.add(userMsgJson); // 📌 Add to history

//             sendButton.setEnabled(false); // disable but
// String botResponse = sendMessageToBot(userMessag
// sendButton.setEnabled(tru ;  // re-enable after response
//             chatArea.append("Bot: " + botResponse + "\n");
//             chatArea.setCaretPosition(chatArea.getDocument().getLength());
//         }
//   

//  private String sendMessageToBot(String userMessage
//    int maxRetries =
//    int retryDelay = 1500; // milliseco

//    for (int attempt = 1; attempt <= maxRetries; attempt++
//        tr
//            URL url = new URL(API_UR
//            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection
//            conn.setRequestMethod("POST
//            conn.setRequestProperty("Authorization", "Bearer " + API_KE
//            conn.setRequestProperty("Content-Type", "application/json
//            conn.setDoOutput(tru

//            // Build the requ
//            JSONObject jsonRequest = new JSONObject
//            jsonRequest.put("model", "gpt-3.5-turbo

//            JSONArray messages = new JSONArray
//            JSONObject userMessageJson = new JSONObject
//            userMessageJson.put("role", "user
//            userMessageJson.put("content", userMessag
//            messages.put(userMessageJso
//            jsonRequest.put("messages", message

//            // Send requ
//            try (OutputStream os = conn.getOutputStream()
//                byte[] input = jsonRequest.toString().getBytes("utf-8
//                os.write(input, 0, input.lengt

//            int responseCode = conn.getResponseCode
//            if (responseCode == 429
//                System.out.println("⚠️ Rate limited. Retrying... (" + attempt + ")
//                Thread.sleep(retryDela
//                continue; // Try ag

//            if (responseCode != 200
//                BufferedReader errReader = new BufferedRead
//                     er(new InputStreamReader(conn.getErrorStream(), "utf-8"
//                StringBuilder errorResponse = new StringBuilder
//                String li
//                while ((line = errReader.readLine()) != null
//                    errorResponse.append(lin

//                errReader.close
//                System.err.println("❌ Error response: " + errorResponse.toString(
//                return "❌ Error from API (Code: " + responseCode + "

//            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"
//            StringBuilder response = new StringBuilder
//            String li
//            while ((line = in.readLine()) != null
//                response.append(lin

//            in.close

//            JSONObject jsonResponse = new JSONObject(response.toString(
//            String botReply = jsonResponse.getJSONArray("choice
//                    .getJSONObject
//                    .getJSONObject("messag
//                    .getString("content

//            return botReply.trim

//        } catch (Exception e
//            e.printStackTrace
//            if (attempt == maxRetries
//                return "❌ Failed after multiple attempts

//            tr
//                Thread.sleep(retryDelay); // Wait before next re
//            } catch (InterruptedException ie
//                Thread.currentThread().interrupt(); // Restore interrupted sta
//                return "❌ Interrupted during retry

//    return "❌ Unexpected error
// }

//     private void sendToAuthority() {
//         String authorityMessage = JOptionPane.showInputDialog(null, "Enter your message for the authority:");
//         if (authorityMessage != null && !authorityMessage.trim().isEmpty()) {
//             try {
//                 EmailService.sendEma
//    "authority@example.co
//    "Student Message from ChatBo
//    authorityMess   );
//                 JOptionPane.showMessageDialog(null, "Message sent to authority successfully ✅");
//             } catch (Exception e) {
//                 JOptionPane.showMessageDialog(null, "Failed to send message ❌");
//                 e.printStackTrace();
//             }
//         } else {
//             JOptionPane.showMessageDialog(null, "Message cannot be empty!");
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> new Main());
//     }
// }

public class Main {
}