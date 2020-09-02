package com.ralph.application;

import com.ralph.param.DataBase;
import com.ralph.param.Parametre;
import com.ralph.param.ResultSetTableModel;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author alphonse
 */
public class Utilisateur extends javax.swing.JFrame {

      ResultSet rs;
      DataBase db;

      public Utilisateur() {
            super("CLIENT");
            db = new DataBase(Parametre.HOST, Parametre.USERNAME, Parametre.PASSWORD);

            initComponents();
            // this.setExtendedState(MAXIMIZED_BOTH);

            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      }

      public void table() {
            String a[] = {"id", "id_user", "username", "password", "type"};
            rs = db.querySelect(a, "utilisateur");
            table_user.setModel(new ResultSetTableModel(rs));
      }

      void actualiser() {
            txt_idu.setText("");
            txt_usn.setText("");
            txt_pass.setText("");
            com_typ.setSelectedItem("Type");
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            table_user = new javax.swing.JTable();
            jButton_act = new javax.swing.JButton();
            jButton_aj = new javax.swing.JButton();
            jButton_mod = new javax.swing.JButton();
            jButton_sup = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            txt_rech = new javax.swing.JTextField();
            txt_idu = new javax.swing.JTextField();
            txt_usn = new javax.swing.JTextField();
            txt_pass = new javax.swing.JTextField();
            com_typ = new javax.swing.JComboBox<>();
            jLabel6 = new javax.swing.JLabel();
            com_rech = new javax.swing.JComboBox<>();
            jButton_rech = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setFont(new java.awt.Font("Z003", 0, 48)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 0, 0));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Client");

            table_user.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
            table_user.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                  },
                  new String [] {
                        "ID", "ID_USER", "USERNAME", "PASSWORD", "TYPE"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            table_user.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        table_userMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(table_user);

            jButton_act.setForeground(new java.awt.Color(255, 0, 0));
            jButton_act.setText("Actualiser");
            jButton_act.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
            jButton_act.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton_actActionPerformed(evt);
                  }
            });

            jButton_aj.setForeground(new java.awt.Color(255, 0, 0));
            jButton_aj.setText("Ajouter");
            jButton_aj.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
            jButton_aj.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton_ajActionPerformed(evt);
                  }
            });

            jButton_mod.setForeground(new java.awt.Color(255, 0, 0));
            jButton_mod.setText("Modifier");
            jButton_mod.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
            jButton_mod.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton_modActionPerformed(evt);
                  }
            });

            jButton_sup.setForeground(new java.awt.Color(255, 0, 0));
            jButton_sup.setText("Supprimer");
            jButton_sup.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
            jButton_sup.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton_supActionPerformed(evt);
                  }
            });

            jLabel2.setText("TYPE");

            jLabel3.setText("ID_USER");

            jLabel4.setText("USERNAME");

            jLabel5.setText("PASSWORD");

            com_typ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Directeur", "Caissier" }));

            jLabel6.setText("Recherche par categorie");

            com_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_user", "username", "password", "type" }));

            jButton_rech.setText("Recherche");
            jButton_rech.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton_rechActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jButton_aj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(77, 77, 77)
                                    .addComponent(jButton_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(93, 93, 93)
                                    .addComponent(jButton_sup, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(106, 106, 106)
                                    .addComponent(jButton_act, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(com_typ, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(44, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(txt_idu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(txt_usn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jButton_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(446, 446, 446))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_aj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_sup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_act, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(txt_idu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(txt_usn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(com_typ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(70, 70, 70)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jButton_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(107, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      //Ajout utilisateur
    private void jButton_ajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ajActionPerformed
          // si jtextfield est vide
          if (txt_idu.getText().equals("") || txt_usn.getText().equals("") || txt_pass.getText().equals("") || com_typ.getSelectedItem().equals("Type")) {

                JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");//affiche cet message

          } else {
                String[] colon = {"id_user", "username", "password", "type"};

                String[] inf = {txt_idu.getText(), txt_usn.getText(), txt_pass.getText(), com_typ.getSelectedItem().toString()};

                System.out.println(db.queryInsert("utilisateur", colon, inf));

                table();
                actualiser();
          }
    }//GEN-LAST:event_jButton_ajActionPerformed
      //Modification
    private void jButton_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modActionPerformed

          if (txt_idu.getText().equals("") || txt_usn.getText().equals("") || txt_pass.getText().equals("") || com_typ.getSelectedItem().equals("Type")) {

                JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");

          } else {
                String[] colon = {"id_user", "username", "password", "type"};
                String[] inf = {txt_idu.getText(), txt_usn.getText(), txt_pass.getText(), com_typ.getSelectedItem().toString()};
                String id = String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 0));
                System.out.println(db.queryUpdate("utilisateur", colon, inf, "id='" + id + "'"));
                table();
                actualiser();
          }
    }//GEN-LAST:event_jButton_modActionPerformed
      //suppression
    private void jButton_supActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_supActionPerformed

          String id = String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 0));

          if (JOptionPane.showConfirmDialog(this, "Suprimer ", "attention !!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                // si choix égal Ok on supprime 
                db.queryDelete("utilisateur", "id=" + id);
          } else {

                return;
          }
          table();
    }//GEN-LAST:event_jButton_supActionPerformed
      //Actualiser
    private void jButton_actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actActionPerformed

          actualiser();// on appel la methode actualiser()
          table();
    }//GEN-LAST:event_jButton_actActionPerformed
      //Recherche
    private void jButton_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechActionPerformed

          if (txt_rech.getText().equals("")) {

                JOptionPane.showMessageDialog(this, "SVP entrer l'information \nque vous souhaitez à chercher");

          } else {
                // combo box recherche categorie égal id_user
                if (com_rech.getSelectedItem().equals("id_user")) {

                      rs = db.selectAll("utilisateur", "id_user LIKE '%" + txt_rech.getText() + "%' ");
                      table_user.setModel(new ResultSetTableModel(rs));

                } else if (com_rech.getSelectedItem().equals("username")) {
                      rs = db.selectAll("utilisateur", "username LIKE '%" + txt_rech.getText() + "%' ");
                      table_user.setModel(new ResultSetTableModel(rs));

                } else if (com_rech.getSelectedItem().equals("password")) {
                      rs = db.selectAll("utilisateur", "password LIKE '%" + txt_rech.getText() + "%' ");
                      table_user.setModel(new ResultSetTableModel(rs));

                } else if (com_rech.getSelectedItem().equals("type")) {
                      rs = db.selectAll("utilisateur", "type LIKE '%" + txt_rech.getText() + "%' ");
                      table_user.setModel(new ResultSetTableModel(rs));
                }
          }
    }//GEN-LAST:event_jButton_rechActionPerformed
      //Si on clique le ligne du tableau on affiche sur jtextfield
    private void table_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_userMouseClicked

          txt_idu.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 1)));
          txt_usn.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 2)));
          txt_pass.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 3)));
          com_typ.setSelectedItem(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 4)));
    }//GEN-LAST:event_table_userMouseClicked

      public static void main(String args[]) throws Exception {

            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            java.awt.EventQueue.invokeLater(() -> {
                  new Utilisateur().setVisible(true);
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JComboBox<String> com_rech;
      private javax.swing.JComboBox<String> com_typ;
      private javax.swing.JButton jButton_act;
      private javax.swing.JButton jButton_aj;
      private javax.swing.JButton jButton_mod;
      private javax.swing.JButton jButton_rech;
      private javax.swing.JButton jButton_sup;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JTable table_user;
      private javax.swing.JTextField txt_idu;
      private javax.swing.JTextField txt_pass;
      private javax.swing.JTextField txt_rech;
      private javax.swing.JTextField txt_usn;
      // End of variables declaration//GEN-END:variables

}
