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
public class Produit extends javax.swing.JFrame {

      ResultSet rs;
      DataBase db;

      public Produit() {
            super("PRODUIT");
            db = new DataBase(Parametre.HOST, Parametre.USERNAME, Parametre.PASSWORD);

            //this.setResizable(false);
            initComponents();
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            table();
      }

      private void table() {
            String t[] = {"id", "code_produit", "reference", "designation", "fournisseur", "prix", "stock"};
            rs = db.querySelect(t, "produit");
            table_prod.setModel(new ResultSetTableModel(rs));
      }

      void actualiser() {
            txt_cod.setText("");
            txt_ref.setText("");
            txt_design.setText("");
            txt_fourn.setText("");
            txt_prix.setText("");
            txt_stock.setText("");
      }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_prod = new javax.swing.JTable();
        btn_ajout = new javax.swing.JButton();
        btn_modif = new javax.swing.JButton();
        btn_supp = new javax.swing.JButton();
        btn_actu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        com_rech = new javax.swing.JComboBox<>();
        btn_rech = new javax.swing.JButton();
        txt_rech = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        txt_ref = new javax.swing.JTextField();
        txt_design = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_fourn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_prix = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(58, 90, 74));

        jLabel1.setFont(new java.awt.Font("Z003", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("GESTION DES PRODUITS");

        table_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Code_produit", "Reference", "Designation", "Fournisseur", "Prix", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_prod);

        btn_ajout.setText("Ajouter");
        btn_ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajoutActionPerformed(evt);
            }
        });

        btn_modif.setText("Modifier");
        btn_modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifActionPerformed(evt);
            }
        });

        btn_supp.setText("Supprimer");
        btn_supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suppActionPerformed(evt);
            }
        });

        btn_actu.setText("Actualiser");
        btn_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actuActionPerformed(evt);
            }
        });

        jLabel2.setText("Recherche par categorie");

        com_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "reference", "designation", "fournisseur", "prix", "stock" }));

        btn_rech.setText("Recherche");
        btn_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rechActionPerformed(evt);
            }
        });

        jLabel3.setText("Code produit");

        jLabel4.setText("Reference");

        jLabel5.setText("Designation");

        jLabel7.setText("Fournisseur");

        jLabel9.setText("Prix");

        jLabel10.setText("Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1348, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btn_ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btn_supp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_actu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(976, 976, 976)
                .addComponent(btn_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txt_fourn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txt_prix, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txt_design, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fourn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_prix, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_design, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajoutActionPerformed

          if (txt_cod.getText().equals("") || txt_ref.getText().equals("")
                  || txt_design.getText().equals("")
                  || txt_fourn.getText().equals("")
                  || txt_prix.getText().equals("") || txt_stock.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
          } else {
                String[] colon = {"code_produit", "reference", "designation", "fournisseur", "prix", "stock"};
                String[] inf = {txt_cod.getText(), txt_ref.getText(), txt_design.getText(), txt_fourn.getText(),
                       txt_prix.getText(), txt_stock.getText()};
                System.out.println(db.queryInsert("produit", colon, inf));
                table();
                actualiser();
          }
    }//GEN-LAST:event_btn_ajoutActionPerformed

    private void btn_modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifActionPerformed

          if (txt_cod.getText().equals("") || txt_ref.getText().equals("")
                  || txt_design.getText().equals("") || txt_fourn.getText().equals("")
                  || txt_prix.getText().equals("") || txt_stock.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
          } 
          else {
                String colon[] = {"code_produit","reference", "designation","fournisseur","prix","stock"};

                String info[] = {txt_cod.getText(),txt_ref.getText(),txt_design.getText(),txt_fourn.getText(),txt_prix.getText(),txt_stock.getText()};

                String id = String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 0));
                System.out.println(db.queryUpdate("produit", colon, info, "id='" + id + "'"));

                table();
                actualiser();
          }
    }//GEN-LAST:event_btn_modifActionPerformed

    private void btn_suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suppActionPerformed
          String id = String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 0));

          if (JOptionPane.showConfirmDialog(this, "Suprimer", "Attention!!!",
                  JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

                db.queryDelete("produit", "id=" + id);

          } else {
                return;
          }
          table();

    }//GEN-LAST:event_btn_suppActionPerformed

    private void btn_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actuActionPerformed

          actualiser();
          table();
    }//GEN-LAST:event_btn_actuActionPerformed

    private void btn_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rechActionPerformed
          if (txt_rech.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
          } else {
                if (com_rech.getSelectedItem().equals("id")) {
                      rs = db.selectAll("produit", "id LIKE '%" + txt_rech.getText() + "%' ");
                      table_prod.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("code_produit")) {
                      rs = db.selectAll("produit", "code_produit LIKE '%" + txt_rech.getText() + "%' ");
                      table_prod.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("reference")) {
                      rs = db.selectAll("produit", "reference LIKE '%" + txt_rech.getText() + "%' ");
                      table_prod.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("designation")) {
                      rs = db.selectAll("produit", "designation LIKE '%" + txt_rech.getText() + "%' ");
                      table_prod.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("rangement")) {
                      rs = db.selectAll("produit", "rangement LIKE '%" + txt_rech.getText() + "%' ");
                      table_prod.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("fournisseur")) {
                      rs = db.selectAll("produit", "fournisseur LIKE '%" + txt_rech.getText() + "%' ");
                      table_prod.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("remise")) {
                      rs = db.selectAll("produit", "remise LIKE '%" + txt_rech.getText() + "%' ");
                      table_prod.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("prix")) {
                      rs = db.selectAll("produit", "prix LIKE '%" + txt_rech.getText() + "%' ");
                      table_prod.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("stock")) {
                      rs = db.selectAll("produit", "stock LIKE '%" + txt_rech.getText() + "%' ");
                      table_prod.setModel(new ResultSetTableModel(rs));
                }
          }
    }//GEN-LAST:event_btn_rechActionPerformed

    private void table_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_prodMouseClicked

          txt_cod.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 1)));
          txt_ref.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 2)));
          txt_design.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 3)));

          txt_fourn.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 4)));

          txt_prix.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 5)));
          txt_stock.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 6)));

    }//GEN-LAST:event_table_prodMouseClicked

      public static void main(String args[]) throws Exception {

            UIManager.setLookAndFeel(new NimbusLookAndFeel());

            java.awt.EventQueue.invokeLater(() -> {
                  new Produit().setVisible(true);
            });

      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actu;
    private javax.swing.JButton btn_ajout;
    private javax.swing.JButton btn_modif;
    private javax.swing.JButton btn_rech;
    private javax.swing.JButton btn_supp;
    private javax.swing.JComboBox<String> com_rech;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_prod;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_design;
    private javax.swing.JTextField txt_fourn;
    private javax.swing.JTextField txt_prix;
    private javax.swing.JTextField txt_rech;
    private javax.swing.JTextField txt_ref;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}
