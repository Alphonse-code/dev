package com.ralph.application;

import com.ralph.param.DataBase;
import com.ralph.param.Parametre;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author alphonse
 */
public class Login extends javax.swing.JFrame {

      //declaration
      ResultSet rs;
      DataBase db;
      String username1, password1, typ;

      public Login() {
            super("Login");
            db = new DataBase(Parametre.HOST, Parametre.USERNAME, Parametre.PASSWORD);

            initComponents();
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setResizable(false);

      }

      @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jTextField1_login = new javax.swing.JTextField();
                jPasswordField1 = new javax.swing.JPasswordField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jButton1_fermer = new javax.swing.JButton();
                jButton2_login = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(java.awt.Color.darkGray);

                jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 0, 0));
                jLabel1.setText("Authentifiction ");

                jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 0, 0));
                jLabel2.setText("Login");

                jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(0, 0, 0));
                jLabel3.setText("Password");

                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOG.png"))); // NOI18N

                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login.png"))); // NOI18N

                jButton1_fermer.setBackground(new java.awt.Color(9, 31, 49));
                jButton1_fermer.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
                jButton1_fermer.setForeground(new java.awt.Color(153, 0, 0));
                jButton1_fermer.setText("Fermer");
                jButton1_fermer.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1_fermerActionPerformed(evt);
                        }
                });

                jButton2_login.setBackground(new java.awt.Color(9, 31, 49));
                jButton2_login.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
                jButton2_login.setForeground(new java.awt.Color(153, 0, 0));
                jButton2_login.setText("Login");
                jButton2_login.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2_loginActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTextField1_login, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                                                        .addComponent(jPasswordField1)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton2_login)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton1_fermer)))
                                                .addGap(47, 47, 47)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(148, 148, 148)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(10, 10, 10))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(52, 52, 52)
                                                        .addComponent(jLabel1)
                                                        .addGap(70, 70, 70)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField1_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(106, 106, 106)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton2_login)
                                                                .addComponent(jButton1_fermer))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)))
                                .addGap(91, 91, 91))
                );

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

    private void jButton1_fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_fermerActionPerformed
          dispose();
    }//GEN-LAST:event_jButton1_fermerActionPerformed

    private void jButton2_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_loginActionPerformed
          rs = db.selectAll("utilisateur", "Username = '" + jTextField1_login.getText()
                  + "' and Password = '" + jPasswordField1.getText() + "'");
          try {
                while (rs.next()) {
                      username1 = rs.getString("Username");
                      password1 = rs.getString("Password");
                      typ = rs.getString("Type");
                }
          } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
          }

          if (username1 == null && password1 == null) {
                JOptionPane.showMessageDialog(this, "Le nom d'utilisateur ou le mots de pass est incorrect");
          } else {

                // si en a le directeur le programme s'ouvre dans principal
                if (typ.equals("Directeur")) {
                      Principale h = new Principale();
                      h.setVisible(true);
                      this.dispose();

                      // si en a le Caissier le programme s'ouvre dans Caisser
                } else {
                      Caissier k = new Caissier();
                      k.setVisible(true);
                      this.dispose();
                }
          }
    }//GEN-LAST:event_jButton2_loginActionPerformed

      public static void main(String args[]) throws Exception {

            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            java.awt.EventQueue.invokeLater(() -> {
                  new Login().setVisible(true);
            });
      }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1_fermer;
        private javax.swing.JButton jButton2_login;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPasswordField jPasswordField1;
        private javax.swing.JTextField jTextField1_login;
        // End of variables declaration//GEN-END:variables
}
