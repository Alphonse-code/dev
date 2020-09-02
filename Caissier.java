package com.ralph.application;

import com.ralph.param.DataBase;
import com.ralph.param.Parametre;
import com.ralph.param.ResultSetTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Caissier extends javax.swing.JFrame {

      ResultSet rs;
      DataBase db;

      int stk, qtt;

      public Caissier() {
            super("Vente");
            db = new DataBase(Parametre.HOST, Parametre.USERNAME, Parametre.PASSWORD);
            initComponents();

            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            table();

            dates();
      }

      private void table() {
            String colon[] = {"code_produit", "reference", "designation", "fournisseur", "prix", "stock"};

            rs = db.querySelect(colon, "produit");
            tbl_Produit.setModel(new ResultSetTableModel(rs));
      }

      public void importer() {
            String colon[] = {"num_facture", "code_produit", "reference", "prix_vente", "quantiter", "sous_total"};
            rs = db.fcSelectCommand(colon, "vente", "num_facture='" + txt_fac.getText() + "'");
            tbl_ven.setModel(new ResultSetTableModel(rs));
      }

      private void dates() {
            Date s = new Date();
            SimpleDateFormat tgl = new SimpleDateFormat("EEEE dd MMM yyyy");
            SimpleDateFormat dat = new SimpleDateFormat("HH:mm");
            lbl1.setText(dat.format(s));
            lbl2.setText(tgl.format(s));
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            tbl_Produit = new javax.swing.JTable();
            jLabel2 = new javax.swing.JLabel();
            com_rech = new javax.swing.JComboBox<>();
            btn_cherResult = new javax.swing.JButton();
            txt_rech = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            txt_codProd = new javax.swing.JTextField();
            txt_quantiter = new javax.swing.JTextField();
            txt_prix = new javax.swing.JTextField();
            txt_reference = new javax.swing.JTextField();
            txt_fournisseur = new javax.swing.JTextField();
            btn_ajoutTbleVent = new javax.swing.JButton();
            lbl_totProduit = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            tbl_ven = new javax.swing.JTable();
            btn_cherchNumFac = new javax.swing.JButton();
            txt_fac = new javax.swing.JTextField();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            lbl_totVen = new javax.swing.JLabel();
            txt_remis = new javax.swing.JTextField();
            txt_rendu = new javax.swing.JTextField();
            jLabel17 = new javax.swing.JLabel();
            jLabel18 = new javax.swing.JLabel();
            btn_imprimer = new javax.swing.JButton();
            btn_annuler = new javax.swing.JButton();
            jPanel1 = new javax.swing.JPanel();
            jLabel19 = new javax.swing.JLabel();
            lbl2 = new javax.swing.JLabel();
            lbl1 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(57, 65, 67));

            jLabel1.setBackground(new java.awt.Color(0, 102, 102));
            jLabel1.setFont(new java.awt.Font("Z003", 0, 36)); // NOI18N
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Gestion des ventes");
            jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 3, 0, new java.awt.Color(255, 204, 0)));
            jLabel1.setOpaque(true);

            tbl_Produit.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                  },
                  new String [] {
                        "Code_produit", "Reference", "Designation", "Fournisseur", "Prix", "Stock"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            tbl_Produit.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tbl_ProduitMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(tbl_Produit);

            jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
            jLabel2.setText("Recherche par categorie");

            com_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "code_produit", "reference", "desigration", "fournisseur", "prix", "stock", " " }));

            btn_cherResult.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
            btn_cherResult.setText("Recherche");
            btn_cherResult.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_cherResultActionPerformed(evt);
                  }
            });

            jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
            jLabel3.setText("Quantiter");

            jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
            jLabel4.setText("Code produit");

            jLabel5.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
            jLabel5.setText("Reference");

            jLabel7.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
            jLabel7.setText("Fournisseur");

            jLabel9.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
            jLabel9.setText("Prix");

            txt_quantiter.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        txt_quantiterActionPerformed(evt);
                  }
            });
            txt_quantiter.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        txt_quantiterKeyReleased(evt);
                  }
            });

            btn_ajoutTbleVent.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
            btn_ajoutTbleVent.setText("Ajouter au Vente");
            btn_ajoutTbleVent.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_ajoutTbleVentActionPerformed(evt);
                  }
            });

            lbl_totProduit.setText("0");

            tbl_ven.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                  },
                  new String [] {
                        "num_facture", "code_produit", "reference", "prix de vente", "quantiter", "total"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }
            });
            tbl_ven.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tbl_venMouseClicked(evt);
                  }
            });
            jScrollPane2.setViewportView(tbl_ven);

            btn_cherchNumFac.setFont(new java.awt.Font("Z003", 0, 18)); // NOI18N
            btn_cherchNumFac.setText("Recherche");
            btn_cherchNumFac.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_cherchNumFacActionPerformed(evt);
                  }
            });

            jLabel13.setFont(new java.awt.Font("Z003", 0, 20)); // NOI18N
            jLabel13.setText("Num de facture");

            jLabel14.setFont(new java.awt.Font("Z003", 0, 24)); // NOI18N
            jLabel14.setText("Total à payer");

            lbl_totVen.setText("0");

            txt_remis.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        txt_remisKeyReleased(evt);
                  }
            });

            jLabel17.setFont(new java.awt.Font("Z003", 0, 24)); // NOI18N
            jLabel17.setText("Remis");

            jLabel18.setFont(new java.awt.Font("Z003", 0, 24)); // NOI18N
            jLabel18.setText("Rendu");

            btn_imprimer.setFont(new java.awt.Font("Z003", 0, 24)); // NOI18N
            btn_imprimer.setText("Imprimer");
            btn_imprimer.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_imprimerActionPerformed(evt);
                  }
            });

            btn_annuler.setFont(new java.awt.Font("Z003", 0, 24)); // NOI18N
            btn_annuler.setText("Annuler");
            btn_annuler.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_annulerActionPerformed(evt);
                  }
            });

            jPanel1.setBackground(new java.awt.Color(0, 102, 102));

            jLabel19.setFont(new java.awt.Font("Yrsa SemiBold", 0, 24)); // NOI18N
            jLabel19.setForeground(new java.awt.Color(255, 255, 255));
            jLabel19.setText("   Vente");
            jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 2, 0, new java.awt.Color(255, 204, 0)));

            lbl2.setForeground(new java.awt.Color(255, 255, 255));

            lbl1.setForeground(new java.awt.Color(255, 255, 255));

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                              .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(50, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel19)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(14, Short.MAX_VALUE))
            );

            jLabel12.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
            jLabel12.setText("Total");

            jLabel6.setText("Ar");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(btn_cherResult, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(198, 198, 198)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(txt_codProd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(330, 330, 330)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(txt_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(btn_cherchNumFac, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(txt_reference, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(txt_fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(txt_prix, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(175, 175, 175)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(txt_quantiter, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(133, 133, 133)
                                    .addComponent(lbl_totProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(350, 350, 350)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(lbl_totVen, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel6))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(btn_ajoutTbleVent, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(440, 440, 440)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(txt_remis, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(txt_rendu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(850, 850, 850)
                                    .addComponent(btn_imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(btn_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(154, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(btn_cherResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel4))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(txt_codProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel13))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(txt_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(btn_cherchNumFac))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel7)
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel9))
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_reference, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(txt_fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(txt_prix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel3)
                              .addComponent(txt_quantiter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(lbl_totProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel14))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lbl_totVen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel6)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(btn_ajoutTbleVent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel17)
                              .addComponent(txt_remis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel18)
                              .addComponent(txt_rendu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(btn_imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(btn_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(190, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

    private void btn_cherResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cherResultActionPerformed
          if (txt_rech.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "SVP complete le champ de recherche");
          } else {

                if (com_rech.getSelectedItem().equals("code_produit")) {
                      String colon[] = {"code_produit", "reference", "designation", "fournisseur", "prix", "stock"};
                      rs = db.fcSelectCommand(colon, "produit", "code_produit LIKE '" + txt_rech.getText() + "' ");
                      tbl_Produit.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("reference")) {
                      String colon[] = {"code_produit", "reference", "designation", "fournisseur", "prix", "stock"};
                      rs = db.fcSelectCommand(colon, "produit", "reference LIKE '" + txt_rech.getText() + "' ");
                      tbl_Produit.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("designation")) {
                      String colon[] = {"code_produit", "reference", "designation", "fournisseur", "prix", "stock"};
                      rs = db.fcSelectCommand(colon, "produit", "designation LIKE '" + txt_rech.getText() + "' ");
                      tbl_Produit.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("fournisseur")) {
                      String colon[] = {"code_produit", "reference", "designation", "fournisseur", "prix", "stock"};
                      rs = db.fcSelectCommand(colon, "produit", "fournisseur LIKE '" + txt_rech.getText() + "' ");
                      tbl_Produit.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("prix")) {
                      String colon[] = {"code_produit", "reference", "designation", "fournisseur", "prix", "stock"};
                      rs = db.fcSelectCommand(colon, "produit", "prix LIKE '" + txt_rech.getText() + "' ");
                      tbl_Produit.setModel(new ResultSetTableModel(rs));
                } else if (com_rech.getSelectedItem().equals("stock")) {
                      String colon[] = {"code_produit", "reference", "designation", "fournisseur", "prix", "stock"};
                      rs = db.fcSelectCommand(colon, "produit", "stock LIKE '" + txt_rech.getText() + "' ");
                      tbl_Produit.setModel(new ResultSetTableModel(rs));

                }
          }
    }//GEN-LAST:event_btn_cherResultActionPerformed

    private void tbl_ProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ProduitMouseClicked
          txt_codProd.setText(String.valueOf(tbl_Produit.getValueAt(tbl_Produit.getSelectedRow(), 0)));

          txt_reference.setText(String.valueOf(tbl_Produit.getValueAt(tbl_Produit.getSelectedRow(), 1)));

          txt_fournisseur.setText(String.valueOf(tbl_Produit.getValueAt(tbl_Produit.getSelectedRow(), 3)));

          txt_prix.setText(String.valueOf(tbl_Produit.getValueAt(tbl_Produit.getSelectedRow(), 4)));

          txt_prix.getText();
    }//GEN-LAST:event_tbl_ProduitMouseClicked

    private void btn_ajoutTbleVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajoutTbleVentActionPerformed

          if (txt_codProd.getText().equals("") || txt_reference.getText().equals("") || txt_fournisseur.getText().equals("") || txt_prix.getText().equals("") || txt_quantiter.getText().equals("")) {

                JOptionPane.showMessageDialog(this, "SVP entrer vos donneés");
          } else if (txt_fac.getText().equals("")) {

                JOptionPane.showMessageDialog(this, "SVP entrer le num de facture");
          } else {
                String[] colon = {"num_facture", "code_produit", "reference", "prix_vente", "quantiter", "sous_total"};
                String[] info = {txt_fac.getText(), txt_codProd.getText(), txt_reference.getText(), txt_prix.getText(), txt_quantiter.getText(), lbl_totProduit.getText()};

                System.out.println(db.queryInsert("vente", colon, info));

                try {
                      //si le stock inferieure quantiter
                      if (!test_stock()) {
                            JOptionPane.showMessageDialog(this, "Le stock est Limiter");

                      } else {
                            def(); //true
                            table(); //true
                      }
                } catch (SQLException ex) {

                      System.err.println("\n" + ex);
                }
                soustotal();
                importer();
                total();
          }

    }//GEN-LAST:event_btn_ajoutTbleVentActionPerformed

    private void txt_remisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_remisKeyReleased
          rendu();
    }//GEN-LAST:event_txt_remisKeyReleased

    private void btn_cherchNumFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cherchNumFacActionPerformed
          importer();
          total();
    }//GEN-LAST:event_btn_cherchNumFacActionPerformed

    private void btn_imprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimerActionPerformed
          Recu recu = new Recu();
          recu.setVisible(true);
    }//GEN-LAST:event_btn_imprimerActionPerformed

    private void btn_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_annulerActionPerformed

          String invoice = txt_fac.getText();
          if (JOptionPane.showConfirmDialog(this, "Annuler ", "attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

                System.out.println(db.queryDelete("vente", "num_facture=" + invoice));

          } else {
                return;
          }
          importer();
          total();
    }//GEN-LAST:event_btn_annulerActionPerformed

    private void txt_quantiterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_quantiterKeyReleased
          soustotal();
    }//GEN-LAST:event_txt_quantiterKeyReleased

    private void txt_quantiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantiterActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantiterActionPerformed

    private void tbl_venMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_venMouseClicked
          // TODO add your handling code here:
    }//GEN-LAST:event_tbl_venMouseClicked

      public void soustotal() {
            double a = Double.parseDouble(txt_prix.getText());

            double b = Double.parseDouble(txt_quantiter.getText());
            double c = a * b;
            lbl_totProduit.setText(String.valueOf(c));
      }

      public void total() {
            rs = db.exécutionQuery("SELECT SUM(sous_total) as sous_total FROM vente WHERE num_facture = '" + txt_fac.getText() + "'");
            try {
                  rs.next();
                  lbl_totVen.setText(rs.getString("sous_total"));
            } catch (SQLException ex) {
                  Logger.getLogger(Caissier.class.getName()).log(Level.SEVERE, null, ex);
            }
      }

      public boolean test_stock() throws SQLException {
            boolean teststock;
            rs = db.selectAll("produit", "code_produit='" + txt_codProd.getText() + "'");
            while (rs.next()) {

                  stk = rs.getInt("stock");
            }
            qtt = Integer.parseInt(txt_quantiter.getText());

            teststock = stk >= qtt;

            return teststock;
      }

      public void def() throws SQLException {
            rs = db.selectAll("produit", "code_produit='" + txt_codProd.getText() + "'");
            while (rs.next()) {
                  stk = rs.getInt("stock");
            }
            qtt = Integer.parseInt(txt_quantiter.getText());

            String nvstock = Integer.toString(stk - qtt);

            String a = String.valueOf(nvstock);
            String[] colon = {"stock"};
            String[] isi = {a};
            System.out.println(db.queryUpdate("produit", colon, isi, "code_produit='" + txt_codProd.getText() + "'"));
      }

      public void rendu() {
            double a = Double.parseDouble(lbl_totVen.getText());
            double b = Double.parseDouble(txt_remis.getText());
            double c = b - a;                                  //rendu

            txt_rendu.setText(Double.toString(c));
      }

      public static void main(String args[]) throws Exception {

            UIManager.setLookAndFeel(new NimbusLookAndFeel());

            java.awt.EventQueue.invokeLater(() -> {
                  new Caissier().setVisible(true);
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btn_ajoutTbleVent;
      private javax.swing.JButton btn_annuler;
      private javax.swing.JButton btn_cherResult;
      private javax.swing.JButton btn_cherchNumFac;
      private javax.swing.JButton btn_imprimer;
      private javax.swing.JComboBox<String> com_rech;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel12;
      private javax.swing.JLabel jLabel13;
      private javax.swing.JLabel jLabel14;
      private javax.swing.JLabel jLabel17;
      private javax.swing.JLabel jLabel18;
      private javax.swing.JLabel jLabel19;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane2;
      public static javax.swing.JLabel lbl1;
      public static javax.swing.JLabel lbl2;
      public static javax.swing.JLabel lbl_totProduit;
      public static javax.swing.JLabel lbl_totVen;
      private javax.swing.JTable tbl_Produit;
      private javax.swing.JTable tbl_ven;
      private javax.swing.JTextField txt_codProd;
      public static javax.swing.JTextField txt_fac;
      private javax.swing.JTextField txt_fournisseur;
      private javax.swing.JTextField txt_prix;
      private javax.swing.JTextField txt_quantiter;
      private javax.swing.JTextField txt_rech;
      private javax.swing.JTextField txt_reference;
      public static javax.swing.JTextField txt_remis;
      private javax.swing.JTextField txt_rendu;
      // End of variables declaration//GEN-END:variables
}
