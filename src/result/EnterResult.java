/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.bridj.util.Pair;
import java.sql.*;
import studentmanagementapp.DBConnect;


public class EnterResult
        extends javax.swing.JFrame {
        int x,i;
        int s = 0;
        int num =0;
        ArrayList<Pair <String,Integer>> p1;
        ArrayList<Pair < javax.swing.JTextField, javax.swing.JTextField>> jfield;
        
    public EnterResult() {
        initComponents();
        try{
            Connection con = DBConnect.connect();
            PreparedStatement ps = con.prepareStatement("select rollno " +
                    "from studata");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                c1.addItem(rs.getString("rollno"));
            }
        }catch(Exception e){}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        c1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        s1 = new javax.swing.JTextField();
        n1 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        s5 = new javax.swing.JTextField();
        n5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        s6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 310, 30));

        jScrollPane1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new java.awt.GridLayout(x, 2, 10, 10));

        s1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        s1.setForeground(new java.awt.Color(0, 0, 102));
        s1.setOpaque(true);
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        jPanel2.add(s1);

        n1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        n1.setForeground(new java.awt.Color(0, 0, 102));
        n1.setOpaque(true);
        jPanel2.add(n1);

        s2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        s2.setForeground(new java.awt.Color(0, 0, 102));
        s2.setOpaque(true);
        jPanel2.add(s2);

        n2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        n2.setForeground(new java.awt.Color(0, 0, 102));
        n2.setOpaque(true);
        jPanel2.add(n2);

        s3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        s3.setForeground(new java.awt.Color(0, 0, 102));
        s3.setOpaque(true);
        jPanel2.add(s3);

        n3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        n3.setForeground(new java.awt.Color(0, 0, 102));
        n3.setOpaque(true);
        jPanel2.add(n3);

        s4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        s4.setForeground(new java.awt.Color(0, 0, 102));
        s4.setOpaque(true);
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        jPanel2.add(s4);

        n4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        n4.setForeground(new java.awt.Color(0, 0, 102));
        n4.setOpaque(true);
        jPanel2.add(n4);

        s5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        s5.setForeground(new java.awt.Color(0, 0, 102));
        s5.setOpaque(true);
        jPanel2.add(s5);

        n5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        n5.setForeground(new java.awt.Color(0, 0, 102));
        n5.setOpaque(true);
        jPanel2.add(n5);

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 530, 340));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Search By :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 120, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("Back");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 120, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Add More ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 150, 50));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 130, 50));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4), "ENTER  RESULT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 570, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled design (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 540));

        s6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        s6.setForeground(new java.awt.Color(0, 0, 102));
        s6.setOpaque(true);
        jPanel1.add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
          p1 = new ArrayList<Pair<String,Integer>>();
          
          p1.add(new Pair<String,Integer>(s1.getText(),Integer.parseInt(n1.getText())));
          p1.add(new Pair<String,Integer>(s2.getText(),Integer.parseInt(n2.getText())));
          p1.add(new Pair<String,Integer>(s3.getText(),Integer.parseInt(n3.getText())));
          p1.add(new Pair<String,Integer>(s4.getText(),Integer.parseInt(n4.getText())));
          p1.add(new Pair<String,Integer>(s5.getText(),Integer.parseInt(n5.getText())));
        
        if(jfield!=null){
          //    System.out.println(jfield);
          for(Pair<JTextField, JTextField> pair : jfield){
            JTextField sub = pair.getKey(); // key
            JTextField mark = pair.getValue();//value
            // Get the text from the JTextField key
            String subStr = sub.getText();
            String markStr = mark.getText();
           p1.add(new Pair<String,Integer>(subStr,Integer.parseInt(markStr)));

            // Print the text from the key JTextField
            System.out.println("subject : " + subStr);         
            System.out.println("marks : " + markStr);         
          }
         }
        System.out.println(p1);

            // Convert p1 to JSON
//            {
//            key :"value"
//        }
            Gson gson = new Gson();
            String json = gson.toJson(p1);
                Connection con = DBConnect.connect();
                PreparedStatement ps = con.prepareStatement("insert into result values(?,?)");
                ps.setString(1,c1.getSelectedItem().toString());
                ps.setString(2,json);
                int a = ps.executeUpdate();
                
                if(a==1){
                    JOptionPane.showMessageDialog(null, "Result declared Successfully");
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Some Error ... try again later");
                }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      try{
//            enter the number of additional subjects
            num = Integer.parseInt(JOptionPane.showInputDialog("enter the " +
                    "number of subjects you want to add"));
//            incrementing the rows
             x = 5+num;
//             intialize jfield ArrayList 
             jfield = new ArrayList<Pair< javax.swing.JTextField, javax.swing.JTextField>>();
            int top = 410;
//            System.out.println(num);
            for(i=0;i<num;i++){
                top += 60;
               javax.swing.JTextField newj,newm;
               newj = new javax.swing.JTextField();
                newj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                newj.setForeground(new java.awt.Color(0, 0, 102));
                newj.setOpaque(true);
                jPanel2.add(newj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 
                        top, 210, 40));
//               System.out.println("OK--sub");


                newm =  new javax.swing.JTextField();
//                newm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
//                newm.setForeground(new java.awt.Color(0, 0, 102));
//                newm.setOpaque(true);
                jPanel2.add(newm, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 
                        top, 210, 40));
//                   System.out.println("OK--mark");
                   
                   
                    jfield.add(
                            new Pair<javax.swing.JTextField, javax.swing.JTextField>
        (newj,newm));

           }
             s = num;
            // Revalidate and repaint the panel to reflect the new components
        jPanel2.setPreferredSize(new java.awt.Dimension(jPanel2.getWidth(),
                top+100));
        jPanel2.revalidate();
        jPanel2.repaint();
        }catch(Exception e){
            System.out.println(e);
        }       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s4ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

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
            java.util.logging.Logger.getLogger(EnterResult.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterResult.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterResult.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterResult.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField s6;
    // End of variables declaration//GEN-END:variables
}
