/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student;

import com.google.gson.Gson;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.TableModel;
import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;
import studentmanagementapp.DBConnect;

public class AddStudent
        extends javax.swing.JFrame {
        String imgPath;
        ByteArrayOutputStream out = null;
        ImageIcon icon;
         byte[] imageData ;

    public AddStudent() {
        initComponents();
//        ITSKILL20241
        try{
        Connection con = DBConnect.connect();
        PreparedStatement ps = con.prepareStatement("select max(rollno) from studata");
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            String it = rs.getString(1).substring(0,7);//itskill
            int rollno = Integer.parseInt(rs.getString(1).substring(7))+1;//20242
            t2.setText(it+rollno);
            t2.setEditable(false);
        }
        else{
            System.out.println("error");
        }
        }catch(Exception e){}
    }

    public ImageIcon resizePic(String pic) {
        ImageIcon myimg = new ImageIcon(pic);
        Image img = myimg.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(),
                Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }
    
    public void generateQR(){
       HashMap<String,String> data = new HashMap<>();
       data.put("name",t1.getText());
       data.put("email",t3.getText());
       data.put("rollno",t2.getText());
       System.out.println(data);
//       "{name=abc , email=asdf,rollno=123}"
       Gson gson = new Gson(); // google => gson   data (object / hashmap) =>json
       String jsonData = gson.toJson(data);//"{"name":"sdf","email"}"
       out = QRCode.from(jsonData).withSize(300,250).to(ImageType.PNG).stream(); //binary 
       try{
           imageData = out.toByteArray();
           icon = new ImageIcon(imageData);
       }catch(Exception e){}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        choice = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        can = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t8 = new com.toedter.calendar.JDateChooser();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        myImage = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        t6 = new javax.swing.JTextArea();
        t1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        sub = new javax.swing.JButton();
        t5 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Upload an image ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 250, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 170, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Class XII (%)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 170, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Class X (%)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 170, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 170, 40));

        choice.setBackground(new java.awt.Color(255, 102, 0));
        choice.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        choice.setForeground(new java.awt.Color(255, 255, 255));
        choice.setText("Upload");
        choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceActionPerformed(evt);
            }
        });
        jPanel1.add(choice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 180, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date Of Birth");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 170, 40));

        can.setBackground(new java.awt.Color(255, 102, 0));
        can.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        can.setForeground(new java.awt.Color(255, 255, 255));
        can.setText("Cancel");
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });
        jPanel1.add(can, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 180, 60));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Course");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 170, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 170, 40));
        jPanel1.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 220, 40));

        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 220, 40));

        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 220, 40));

        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 220, 40));

        t10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 220, 40));

        myImage.setBackground(new java.awt.Color(255, 255, 255));
        myImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));
        myImage.setOpaque(true);
        jPanel1.add(myImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, 300));

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cs", "civil", "elect", "mech", "it" }));
        c2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 340, 220, 40));

        t6.setColumns(20);
        t6.setRows(5);
        t6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        jScrollPane1.setViewportView(t6);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 660, 140));

        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 220, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Father's Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 170, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Phone");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 170, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Adhar No");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 170, 40));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Btech", "BCA", "BBA", "Mtech", "MCA", "MBA", " ", " " }));
        c1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 220, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Roll Number");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 170, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Branch");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 170, 40));

        t9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 220, 220, 40));

        sub.setBackground(new java.awt.Color(255, 102, 0));
        sub.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sub.setForeground(new java.awt.Color(255, 255, 255));
        sub.setText("Submit");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        jPanel1.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 180, 60));

        t5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 660, 40));

        t7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 220, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "New Student", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1160, 670));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrd.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceActionPerformed
//     to generate  a pop-up box that will allow to select a file
        JFileChooser file = new JFileChooser();
//     to set the first folder to appear 
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
//     to select the suitable file type
        FileNameExtensionFilter filefilter = new FileNameExtensionFilter(".Images", "jpg", 
                "png", "jpeg", "gif");
//     to add the suitable file extension to the JFileChooser object named file
        file.addChoosableFileFilter(filefilter);
//     to get the state if user have selected a file or not
//      if an image is selected then filestate = 1  ortherwise filestate = 0
        int filestate = file.showSaveDialog(null);
//     conditional statements
        if (filestate == JFileChooser.APPROVE_OPTION) {
//      if an image is selected then get the path of folder
         File sf = file.getSelectedFile();
//      get the absolute path i.e starting from the drive eg: C:/Downloads.... .. the complete path
         String path = sf.getAbsolutePath();
//      send the image/path to resizePic method to adjust the size of image selected acc to the label
//      then set the modified image into the label
         myImage.setIcon(resizePic(path));
         imgPath = path;
        } 
//      part of code to run if no image is selected by the user
        else if (filestate == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showConfirmDialog(null, "NO IMAGE SELECTED");
        }
    }//GEN-LAST:event_choiceActionPerformed

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        dispose();
    }//GEN-LAST:event_canActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        try{
            Connection con = DBConnect.connect();
            PreparedStatement a1 = con.prepareStatement("insert into attendence values(?,'-','-')");
            a1.setString(1,t2.getText());//rollno
            a1.executeUpdate();           
            InputStream ig = new FileInputStream(new File(imgPath)); 
            generateQR();  
            InputStream qr = new ByteArrayInputStream(imageData);
            PreparedStatement ps = con.prepareStatement("insert into studata values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,t1.getText()); // name
            ps.setString(2,t2.getText()); // roll no
            ps.setString(3,t3.getText()); // email id
            ps.setString(4,t4.getText()); // class xii
            ps.setString(5,c1.getSelectedItem().toString()); // course
//            System.out.print(c1.getSelectedItem());
            ps.setString(6,t5.getText()); // aadhar
            ps.setString(7,t6.getText()); // address
            ps.setString(8,t7.getText()); // father
            ps.setString(9,((JTextField)t8.getDateEditor().getUiComponent()).getText()); // dob
            ps.setString(10,t9.getText()); // phone
            ps.setString(11,t10.getText()); // x class
            ps.setString(12,c2.getSelectedItem().toString()); // branch
            ps.setBlob(13,ig); // image 
            ps.setBlob(14,qr); // qr code 
            
            int a = ps.executeUpdate();
            if(a==1){
                JOptionPane.showMessageDialog(null,"Successfully registered a new Student");
                dispose();
            }
            else
               JOptionPane.showMessageDialog(null,"Some Error");

        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_subActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JButton can;
    private javax.swing.JButton choice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel myImage;
    private javax.swing.JButton sub;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextArea t6;
    private javax.swing.JTextField t7;
    private com.toedter.calendar.JDateChooser t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}

