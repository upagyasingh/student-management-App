/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.sql.*;
import studentmanagementapp.DBConnect;

/**
 *
 * @author upagy
 */
public class UpdateStudent
        extends javax.swing.JFrame {
        String imgPath,course,branch;
        byte[] oldImage;
        int changeCourse,changeBranch,changeImage;

    /**
     * Creates new form UpdateStudent
     */
    public UpdateStudent() {
        changeCourse=changeBranch=changeImage=0;
        initComponents();
        t2.setEditable(false);// ROLLNO
        t5.setEditable(false);//AADHAR NO
        t8.setEditable(false);//DOB
        try{
            Connection con = DBConnect.connect();
            PreparedStatement ps = con.prepareStatement("select * from studata");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                c3.addItem(rs.getString(2));
            }
            
        }catch(Exception e){}
    }

    public ImageIcon resizePic(String pic) {
        ImageIcon myimg = new ImageIcon(pic);
        Image img = myimg.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }
    
    public ImageIcon resizePic(byte[] pic){
        ImageIcon myimg =new ImageIcon(pic);
        Image img = myimg.getImage().getScaledInstance(myImage.getWidth(),myImage.getHeight(),Image.SCALE_SMOOTH);
        return new ImageIcon(img);
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
        t2 = new javax.swing.JTextField();
        c3 = new javax.swing.JComboBox<>();
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
        t8 = new javax.swing.JTextField();
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search by Roll No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, 420, 60));

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
        choice.setText("Re-Upload");
        choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceActionPerformed(evt);
            }
        });
        jPanel1.add(choice, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 180, 60));

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

        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 220, 40));

        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        c3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 270, 40));

        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 220, 40));

        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 220, 40));

        t10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 220, 40));

        myImage.setBackground(new java.awt.Color(255, 255, 255));
        myImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));
        myImage.setOpaque(true);
        jPanel1.add(myImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 250, 300));

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Civil", "Electronics", "Mechanical", "IT" }));
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

        t8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 220, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Adhar No");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 170, 40));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B. Tech", "BCA", "BBA", "M. Tech", "MCA", "MBA", " ", " " }));
        c1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
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

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Update Student", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1180, 670));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrd.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceActionPerformed
        changeImage =1;
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filefilter = new FileNameExtensionFilter(".Images", "jpg", "png", "jpeg", "gif");

        file.addChoosableFileFilter(filefilter);
        int filestate = file.showSaveDialog(null);

        if (filestate == JFileChooser.APPROVE_OPTION) {
            File sf = file.getSelectedFile();
            String path = sf.getAbsolutePath();

            myImage.setIcon(resizePic(path));
            imgPath = path;
        }
        else if (filestate == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showConfirmDialog(null, "NO IMAGE SELECTED");
        }
    }//GEN-LAST:event_choiceActionPerformed

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        dispose();
    }//GEN-LAST:event_canActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed

               if(changeCourse==1){
                   course = c1.getSelectedItem().toString();
               }
               if(changeBranch==1){
                   branch = c2.getSelectedItem().toString();
               }
             

        try{
            Connection con = DBConnect.connect();
            PreparedStatement ps = con.prepareStatement("update studata set name=?,rollno=?,"+
                    "email=?,xii=?,course=?,aadhar=?,"+
                    "address=?,fname=?,dob=?,phone=?,x=?,branch=?,image=? where rollno=?");
            ps.setString(1,t1.getText()); // name
            ps.setString(2,t2.getText()); // roll no
            ps.setString(3,t3.getText()); // email id
            ps.setString(4,t4.getText()); // class xii
            ps.setString(5,course); // course
            ps.setString(6,t5.getText()); // aadhar
            ps.setString(7,t6.getText()); // address
            ps.setString(8,t7.getText()); // father
            ps.setString(9,t8.getText()); // dob
            ps.setString(10,t9.getText()); // phone
            ps.setString(11,t10.getText()); // x class
            ps.setString(12,branch); // branch
            if(changeImage==1){
                InputStream ig = new FileInputStream(new File(imgPath));
                ps.setBlob(13,ig);
            }
            else{
                ps.setBlob(13,new ByteArrayInputStream(oldImage));
            }
            ps.setString(14,t2.getText());
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

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
       try{
            Connection con = DBConnect.connect();
            PreparedStatement ps = con.prepareStatement("select * from studata where rollno=?");
            ps.setString(1,c3.getSelectedItem().toString()); //ITSKILL20241

            ResultSet rs = ps.executeQuery();
           while(rs.next()){
               t1.setText(rs.getString(1));// name
               t2.setText(rs.getString(2));// rollno
               t3.setText(rs.getString(3));// email
               t4.setText(rs.getString(4));// xii
                // course
                course = rs.getString(5);
               t5.setText(rs.getString(6));// adhar
               t6.setText(rs.getString(7));// address
               t7.setText(rs.getString(8));// fname
               t8.setText(rs.getString(9));// dob
               t9.setText(rs.getString(10));// phone
               t10.setText(rs.getString(11));// x
                // branch
                branch = rs.getString(12);
                // image
                oldImage =rs.getBytes(13);
                myImage.setIcon(resizePic(oldImage));
               
           }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_c3ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
            changeCourse = 1;
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        changeBranch =1;
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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JComboBox<String> c3;
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
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
