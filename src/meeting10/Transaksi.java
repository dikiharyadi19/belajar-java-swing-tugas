/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meeting10;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Transaksi extends javax.swing.JInternalFrame {
    private DefaultTableModel model;
    /**
     * Creates new form Trantaksi
     */
    public Transaksi() {
        initComponents();
        model= (DefaultTableModel) tbTransaksi.getModel();
      
       // model.getDataVector().removeElements();
        tbTransaksi.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldjumlahTiket = new javax.swing.JTextField();
        fieldBayarTiket = new javax.swing.JTextField();
        comboStudio = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        box1 = new javax.swing.JCheckBox();
        box7 = new javax.swing.JCheckBox();
        box2 = new javax.swing.JCheckBox();
        box8 = new javax.swing.JCheckBox();
        box3 = new javax.swing.JCheckBox();
        box9 = new javax.swing.JCheckBox();
        box4 = new javax.swing.JCheckBox();
        box10 = new javax.swing.JCheckBox();
        box5 = new javax.swing.JCheckBox();
        box6 = new javax.swing.JCheckBox();
        box11 = new javax.swing.JCheckBox();
        box12 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        fieldJumlahMakan = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        fieldJumlahMinum = new javax.swing.JTextField();
        boxMakan = new javax.swing.JCheckBox();
        boxMinum = new javax.swing.JCheckBox();
        fieldBiayaTambahan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransaksi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        fieldTotalPendapatan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fieldKetPaket = new javax.swing.JTextField();

        jLabel1.setText("Nama Kasir");

        jLabel3.setText("Pilihan Studio");

        jLabel4.setText("Jumlah Tiket");

        jLabel5.setText("Bayar Tiket");

        jLabel6.setText("Pembelian Tambahan");

        jLabel7.setText("Jumlah");

        jLabel8.setText("Biaya Paket Tambahan");

        comboStudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==Pilihan==", "Studio 1", "Studio 2", "Studio 3" }));
        comboStudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStudioActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pilihan No Kursi"));

        box1.setText("1");
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        box7.setText("7");
        box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box7ActionPerformed(evt);
            }
        });

        box2.setText("2");
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });

        box8.setText("8");
        box8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box8ActionPerformed(evt);
            }
        });

        box3.setText("3");
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });

        box9.setText("9");
        box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box9ActionPerformed(evt);
            }
        });

        box4.setText("4");
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });

        box10.setText("10");
        box10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box10ActionPerformed(evt);
            }
        });

        box5.setText("5");
        box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box5ActionPerformed(evt);
            }
        });

        box6.setText("6");
        box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box6ActionPerformed(evt);
            }
        });

        box11.setText("11");
        box11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box11ActionPerformed(evt);
            }
        });

        box12.setText("12");
        box12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(box1)
                        .addGap(18, 18, 18)
                        .addComponent(box2)
                        .addGap(18, 18, 18)
                        .addComponent(box3)
                        .addGap(18, 18, 18)
                        .addComponent(box4)
                        .addGap(18, 18, 18)
                        .addComponent(box5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(box6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(box7)
                        .addGap(18, 18, 18)
                        .addComponent(box8)
                        .addGap(18, 18, 18)
                        .addComponent(box9)
                        .addGap(18, 18, 18)
                        .addComponent(box10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(box12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box1)
                    .addComponent(box2)
                    .addComponent(box3)
                    .addComponent(box4)
                    .addComponent(box5)
                    .addComponent(box6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box7)
                    .addComponent(box8)
                    .addComponent(box9)
                    .addComponent(box10)
                    .addComponent(box11)
                    .addComponent(box12))
                .addGap(0, 69, Short.MAX_VALUE))
        );

        jLabel10.setText("Diki Haryadi");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        boxMakan.setText("Makan");
        boxMakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMakanActionPerformed(evt);
            }
        });

        boxMinum.setText("Minum");
        boxMinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMinumActionPerformed(evt);
            }
        });

        tbTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Studio", "judul Film", "HTM", "Jml Beli", "No kursi", "Bayar Tiket", "Ket. Paket", "Biaya Paket", "Total Biaya"
            }
        ));
        jScrollPane1.setViewportView(tbTransaksi);

        jLabel2.setText("TOTAL PENDAPATAN");

        jLabel9.setText("Lembar");

        jLabel11.setText("KET PAKET");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(fieldTotalPendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(134, 134, 134))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboStudio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fieldBayarTiket)
                                    .addComponent(fieldjumlahTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addGap(55, 55, 55)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(379, 379, 379))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldJumlahMakan)
                                    .addComponent(fieldJumlahMinum, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldBiayaTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSimpan)))
                        .addGap(359, 359, 359))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(boxMinum)
                                .addComponent(boxMakan))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(fieldKetPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboStudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldjumlahTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(7, 7, 7)
                        .addComponent(fieldBayarTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldJumlahMakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldBiayaTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldJumlahMinum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxMakan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxMinum)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldKetPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldTotalPendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       String studio,judulFilm,keterangan;
       int htm,jumlahTiket=0,totalBayar,BayarTiket,makan=0,minum=0,biayaTambahan=0,jumlahTambahanMakan=0,jumlahTambahanMinum=0;
     //  a;
       String noKursi;
    private void comboStudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStudioActionPerformed
        if(comboStudio.getSelectedIndex()==1){
            studio="Studio1";
            judulFilm="Get Smurfy";
            htm=75000;
            
            
        }
        else if(comboStudio.getSelectedIndex()==2){
            studio="Studio2";
            judulFilm="Logan";
            htm=85000;
          
           
        }
        else if(comboStudio.getSelectedIndex()==3){
            studio="Studio3";
            judulFilm="John Wick";
            htm=100000;
           
        }
    }//GEN-LAST:event_comboStudioActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        
        jumlahTambahanMakan=Integer.parseInt(fieldJumlahMakan.getText());
        jumlahTambahanMinum=Integer.parseInt(fieldJumlahMinum.getText());
        
        
        
        biayaTambahan=(jumlahTambahanMakan*=makan)+(jumlahTambahanMinum*=minum);
        fieldBiayaTambahan.setText(Integer.toString(biayaTambahan));
      
        totalBayar = BayarTiket+biayaTambahan;
        // studio,judulFilm,keterangan;
       // htm,jumlahTiket=0,totalBayar,BayarTiket,makan=0,minum=0,biayaTambahan=0,jumlahTambahanMakan=0,jumlahTambahanMinum=0;
        Object[] row={studio,judulFilm,htm,jumlahTiket,noKursi,BayarTiket,keterangan,biayaTambahan,totalBayar};
        model.addRow(row);
       // a;
        
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi="1A";
            
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box1ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",2A";
            
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box2ActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",3A";
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box3ActionPerformed

    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box4ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",4A";
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box4ActionPerformed

    private void box5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box5ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",5A";
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box5ActionPerformed

    private void box6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box6ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",6A";
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box6ActionPerformed

    private void box7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box7ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",7A";
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box7ActionPerformed

    private void box8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box8ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",8B";
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box8ActionPerformed

    private void box9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box9ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",9B";
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box9ActionPerformed

    private void box10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box10ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",10B";
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box10ActionPerformed

    private void box11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box11ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",11B";
        }else if(!box1.isSelected()){
            jumlahTiket-=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box11ActionPerformed

    private void box12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box12ActionPerformed
        // TODO add your handling code here:
         if(box1.isSelected()){
            jumlahTiket+=1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
            noKursi+=",12B";
        }else if(!box1.isSelected()){
         
            jumlahTiket=jumlahTiket-1;
            fieldjumlahTiket.setText(Integer.toString(jumlahTiket));
            BayarTiket=htm*jumlahTiket;
            fieldBayarTiket.setText(Integer.toString(BayarTiket));
        }
    }//GEN-LAST:event_box12ActionPerformed

    private void boxMakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMakanActionPerformed
        // TODO add your handling code here:
        
        if(boxMakan.isSelected()){
            makan=30000;
            keterangan=" Makan";
            fieldKetPaket.setText(keterangan);
            
        }else{
            //fieldKetPaket.setText("");
            if(boxMinum.isSelected()){
                keterangan="Minum";
                fieldKetPaket.setText(keterangan);
            }else{
                 fieldKetPaket.setText("");
            }
        }
        if(boxMakan.isSelected()&&boxMinum.isSelected()){
            keterangan +=" dan Makan";
            fieldKetPaket.setText(keterangan);
        }
        
    }//GEN-LAST:event_boxMakanActionPerformed

    private void boxMinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMinumActionPerformed
        // TODO add your handling code here:
        if(boxMinum.isSelected()){
            minum=15000;
            keterangan="Minum";
            fieldKetPaket.setText(keterangan);
            
        }else{
            //fieldKetPaket.setText("");
            if(boxMakan.isSelected()){
                keterangan="Makan";
                fieldKetPaket.setText(keterangan);
            }else{
                 fieldKetPaket.setText("");
                 
            }
        }
        if(boxMakan.isSelected()&&boxMinum.isSelected()){
             keterangan += " dan Minum";
            fieldKetPaket.setText(keterangan);
        }
    }//GEN-LAST:event_boxMinumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box1;
    private javax.swing.JCheckBox box10;
    private javax.swing.JCheckBox box11;
    private javax.swing.JCheckBox box12;
    private javax.swing.JCheckBox box2;
    private javax.swing.JCheckBox box3;
    private javax.swing.JCheckBox box4;
    private javax.swing.JCheckBox box5;
    private javax.swing.JCheckBox box6;
    private javax.swing.JCheckBox box7;
    private javax.swing.JCheckBox box8;
    private javax.swing.JCheckBox box9;
    private javax.swing.JCheckBox boxMakan;
    private javax.swing.JCheckBox boxMinum;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> comboStudio;
    private javax.swing.JTextField fieldBayarTiket;
    private javax.swing.JTextField fieldBiayaTambahan;
    private javax.swing.JTextField fieldJumlahMakan;
    private javax.swing.JTextField fieldJumlahMinum;
    private javax.swing.JTextField fieldKetPaket;
    private javax.swing.JTextField fieldTotalPendapatan;
    private javax.swing.JTextField fieldjumlahTiket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTable tbTransaksi;
    // End of variables declaration//GEN-END:variables
}