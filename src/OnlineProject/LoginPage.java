package OnlineProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;


public class LoginPage extends javax.swing.JFrame {
 
    
    public LoginPage() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jbtnSubmit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtxtPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtfild = new javax.swing.JTextField();
        jbtnClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 26)); // NOI18N
        jLabel8.setText("USER NAME :");
        jPanel1.add(jLabel8);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 190, 40));

        jbtnSubmit.setBackground(new java.awt.Color(51, 255, 0));
        jbtnSubmit.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jbtnSubmit.setForeground(new java.awt.Color(51, 0, 51));
        jbtnSubmit.setText("Submit");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 140, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OnlineShop/Image/download__1_-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 270, 200));

        jtxtPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jtxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 420, 40));

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 26)); // NOI18N
        jLabel7.setText("PASSWORD :");
        jPanel2.add(jLabel7);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 190, 40));

        jLabel1.setFont(new java.awt.Font("Elephant", 3, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("MH Joy ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 110));

        jLabel2.setFont(new java.awt.Font("Elephant", 3, 65)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 250, 80));

        jLabel5.setFont(new java.awt.Font("Elephant", 3, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setText("Online Shop");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jtxtfild.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jtxtfild, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 420, 40));

        jbtnClear.setBackground(new java.awt.Color(255, 51, 51));
        jbtnClear.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jbtnClear.setForeground(new java.awt.Color(51, 0, 51));
        jbtnClear.setText("Clear");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OnlineShop/Image/OptionPage.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
      String Username=jtxtfild.getText();
       String Password=jtxtPass.getText();
       if(Username.equals("Hossain") && Password.equals("1234") || Username.equals("Joy") && Password.equals("5678") || Username.equals("Rezwan") && Password.equals("1234")){
       
           
           ShopSelectionPage shopSelection=new  ShopSelectionPage();
           shopSelection.show();
           dispose();
       
       
       }else{
           JOptionPane.showMessageDialog(rootPane, "Incorect User Name or Password!! ");
       }
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jtxtfild.setText("");
        jtxtPass.setText("");
    }//GEN-LAST:event_jbtnClearActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JPasswordField jtxtPass;
    private javax.swing.JTextField jtxtfild;
    // End of variables declaration//GEN-END:variables
}
