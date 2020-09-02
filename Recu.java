package com.ralph.application;

import com.ralph.param.DataBase;
import com.ralph.param.Parametre;
import com.ralph.param.ResultSetTableModel;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author alphonse
 */
public class Recu extends javax.swing.JFrame {
      
      ResultSet rs;
      DataBase db;
      
      public Recu() {
            
            db = new DataBase(Parametre.HOST, Parametre.USERNAME, Parametre.PASSWORD);
            
            initComponents();
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            inporter();
            date();
      }

      private void inporter() {
            String colon[] = {"num_facture", "code_produit", "reference", "prix_vente", "quantiter", "sous_total"};
            rs = db.fcSelectCommand(colon, "vente", "num_facture='" + Caissier.txt_fac.getText() + "'");
            tble_imp.setModel(new ResultSetTableModel(rs));
            lbl_total.setText(Caissier.lbl_totVen.getText());
            lbl_cas.setText(Caissier.txt_remis.getText());
            rendu();
            
      }
      
      private void date() {
            
            NumFac.setText(Caissier.txt_fac.getText());
            lbl_heure.setText("Le " + Caissier.lbl2.getText());
            lbl_date.setText("   à   " + Caissier.lbl1.getText());
      }
      
      private void rendu() {
            int a = Integer.parseInt(Caissier.lbl_totVen.getText());
            int b = Integer.parseInt(Caissier.txt_remis.getText());
            int c = b - a;
            lbl_pay.setText(Integer.toString(c));
      }
      
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jScrollPane2 = new javax.swing.JScrollPane();
            tble_imp = new javax.swing.JTable();
            print = new javax.swing.JButton();
            retour = new javax.swing.JButton();
            lbl_Total = new javax.swing.JLabel();
            lbl_remis = new javax.swing.JLabel();
            lbl_rendu = new javax.swing.JLabel();
            lbl_pay = new javax.swing.JLabel();
            lbl_cas = new javax.swing.JLabel();
            lbl_total = new javax.swing.JLabel();
            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            lbl_date = new javax.swing.JLabel();
            lbl_heure = new javax.swing.JLabel();
            NumFac = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            tble_imp.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                  },
                  new String [] {
                        "num_facture", "code_produit", "reference", "prix de vente", "stock sortie", "Total"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Float.class, java.lang.Double.class
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }
            });
            jScrollPane2.setViewportView(tble_imp);

            print.setText("Imprimer");
            print.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        printActionPerformed(evt);
                  }
            });

            retour.setText("Retour");
            retour.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        retourActionPerformed(evt);
                  }
            });

            lbl_Total.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
            lbl_Total.setText("A payer");

            lbl_remis.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
            lbl_remis.setText("Remis");

            lbl_rendu.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
            lbl_rendu.setText("Rendu");

            lbl_pay.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
            lbl_pay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            lbl_pay.setText("0");
            lbl_pay.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));

            lbl_cas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
            lbl_cas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            lbl_cas.setText("0");

            lbl_total.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
            lbl_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            lbl_total.setText("0");

            jPanel1.setBackground(new java.awt.Color(0, 102, 102));

            jLabel1.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
            jLabel1.setText("Facture N°");

            NumFac.setFont(new java.awt.Font("serif", 0, 48)); // NOI18N

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_heure, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(137, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(NumFac, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(lbl_heure, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NumFac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );

            jLabel2.setText("Ar");

            jLabel3.setText("Ar");

            jLabel4.setText("Ar");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(lbl_rendu)
                              .addComponent(lbl_remis)
                              .addComponent(lbl_Total))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(lbl_pay, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                              .addComponent(lbl_cas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(lbl_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel2)
                              .addComponent(jLabel3)
                              .addComponent(jLabel4))
                        .addGap(53, 53, 53))
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                              .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(print)
                              .addComponent(retour)
                              .addComponent(lbl_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(lbl_cas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(lbl_remis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(lbl_rendu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(lbl_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
          
          dispose();
    }//GEN-LAST:event_retourActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
          MessageFormat header = new MessageFormat("Facture N° 0002332");
          MessageFormat footer = new MessageFormat("Page{0,number,integer}");
          try {
                tble_imp.print(JTable.PrintMode.NORMAL, header, footer);
                
          } catch (java.awt.print.PrinterException e) {
                System.err.format("Eurreur d'inpression", e.getMessage());
          }
          
    }//GEN-LAST:event_printActionPerformed
      
      public static void main(String args[]) throws Exception {
            
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            java.awt.EventQueue.invokeLater(() -> {
                  
                  new Recu().setVisible(true);
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel NumFac;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JLabel lbl_Total;
      private javax.swing.JLabel lbl_cas;
      private javax.swing.JLabel lbl_date;
      private javax.swing.JLabel lbl_heure;
      private javax.swing.JLabel lbl_pay;
      private javax.swing.JLabel lbl_remis;
      private javax.swing.JLabel lbl_rendu;
      private javax.swing.JLabel lbl_total;
      private javax.swing.JButton print;
      private javax.swing.JButton retour;
      private javax.swing.JTable tble_imp;
      // End of variables declaration//GEN-END:variables
}
