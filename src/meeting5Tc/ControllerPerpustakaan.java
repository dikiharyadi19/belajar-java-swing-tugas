package meeting5Tc;

import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ControllerPerpustakaan {
    private DefaultTableModel model;
    public ControllerPerpustakaan(){
        
        }
     String jenisK,
            jurusan,
            nim,
            nama,
            kode,
            judul,
            pengarang,
            hargaPinjam,
            statusBuku;
    int lamaKembali,status, bayar, Totaldenda, dendaHari;
    int sewa = 0, lamaPinjam;

   public void fieldKeyPressed(java.awt.event.KeyEvent evt, javax.swing.JTextField fieldKode,javax.swing.JTextField fieldJudul,javax.swing.JTextField fieldPengarang){
      

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String kode;
            kode = fieldKode.getText();
            switch (kode) {
                case "101":
                    judul = "Pemrograman java";
                    fieldJudul.setText(judul);
                    pengarang = "Artivisi";
                    dendaHari = 1000;
                    fieldPengarang.setText(pengarang);
                    break;
                case "202":
                    judul = "Ekonomi Syariah";
                    fieldJudul.setText(judul);
                    pengarang = "Nugraha";
                    dendaHari = 2000;
                    fieldPengarang.setText(pengarang);
                    break;
                case "303":
                    judul = "Pendidikan Pancasila";
                    fieldJudul.setText(judul);
                    pengarang = "Artivisi";
                    dendaHari = 3000;
                    fieldPengarang.setText(pengarang);
                    break;
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            fieldJudul.setText("");
            fieldPengarang.setText("");
        }
   }
   public void btnProccess(java.awt.event.ActionEvent evt,javax.swing.JTable tbPerpus,javax.swing.JTextField fieldNim,javax.swing.JTextField fieldNama,javax.swing.JTextField fieldKode,javax.swing.JTextField fieldJudul,javax.swing.JTextField fieldPengarang,javax.swing.JTextField fieldLamaPj,javax.swing.JTextField fieldKembali,javax.swing.JTextField fieldBayar){
        //inisialisasi informasi
        nim = fieldNim.getText();
        nama = fieldNama.getText();
        kode = fieldKode.getText();
        judul = fieldJudul.getText();
        pengarang = fieldPengarang.getText();
        lamaPinjam=Integer.parseInt(fieldLamaPj.getText());
        lamaKembali =Integer.parseInt( fieldKembali.getText());
        
        //operasi hitung total denda
        Totaldenda = (lamaKembali - lamaPinjam) * dendaHari;
        //operasi hitung total bayar
        bayar = (lamaPinjam * sewa) + status + Totaldenda;
        
        //pemberian nilai field Bayar
        fieldBayar.setText(Double.toString(bayar));
        
        //menampilkan informasi ke table
        model = (DefaultTableModel) tbPerpus.getModel();

        Object[] row = {nim, nama, jenisK, jurusan, sewa, kode, judul, pengarang, lamaPinjam, lamaKembali, statusBuku, Totaldenda, bayar};
        model.addRow(row);
   }
   public void radioButton(javax.swing.JRadioButton radioLaki,javax.swing.JRadioButton radioPr)
   {
       if(radioLaki.isSelected()){
           jenisK="Laki-Laki";
       }else if(radioPr.isSelected()){
           jenisK="Perempuan";
       }
   }

   public void boxStatus(javax.swing.JCheckBox boxStatus,javax.swing.JTextField fieldSewa,javax.swing.JTextField fieldStatus)
   {
          if(!boxStatus.isSelected()){

            int sewa = 0;

            sewa = Integer.parseInt(fieldSewa.getText());
            statusBuku = "Tidak Baik";
            status = sewa / 2;
            fieldStatus.setText("" + status);
            
        } else {
            fieldStatus.setText("0");
            statusBuku = "Baik";
            status = 0;
        }
   }
   public void fieldLama(java.awt.event.KeyEvent evt,javax.swing.JTextField fieldLama,javax.swing.JTextField fieldLamaPj)
   {
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           
            lamaPinjam = Integer.parseInt(fieldLamaPj.getText());
        }
   }
   public void clear(javax.swing.JComboBox comboJurusan,javax.swing.JTextField fieldNim,javax.swing.JTextField fieldNama,javax.swing.ButtonGroup groupJurusan,javax.swing.ButtonGroup groupJenisK,javax.swing.JTextField fieldSewa,javax.swing.JTextField fieldKode,javax.swing.JTextField fieldJudul,javax.swing.JTextField fieldPengarang,javax.swing.JTextField fieldLamaPj,javax.swing.JTextField fieldKembali,javax.swing.JCheckBox boxStatus,javax.swing.JTextField fieldStatus,javax.swing.JTextField fieldBayar)
   {
        fieldNim.setText("");
        fieldNama.setText("");
        groupJurusan.clearSelection();
        groupJenisK.clearSelection();
        fieldSewa.setText("");
        fieldKode.setText("");
        fieldJudul.setText("");
        fieldPengarang.setText("");
        fieldPengarang.setText("");
        fieldLamaPj.setText("");
        fieldKembali.setText("");
        boxStatus.setSelected(false);
        fieldStatus.setText("");
        fieldBayar.setText("");
        comboJurusan.setSelectedIndex(0);
   }
   public void DaftarBuku(javax.swing.JTable tbPerpus,javax.swing.JTable daftar)
   {  Object[] bookTi = {"101", "Pemrograman Java", "Artivisi", "10.000", "1000"};
        Object[] bookEkonomi = {"202", "Ekonomi Syariah", "Nugraha", "20.000", "2000"};
        Object[] bookHukum = {"303", "pendidikan pancasila", "gramedia", "30.000", "3000"};

        DefaultTableModel model = (DefaultTableModel) daftar.getModel();
        model.getDataVector().removeAllElements();
        tbPerpus.repaint();
        model.addRow(bookTi);
        model.addRow(bookEkonomi);
        model.addRow(bookHukum);
       
   }
   public void comboJurusan(javax.swing.JCheckBox boxStatus,javax.swing.JComboBox comboJurusan,javax.swing.JTextField fieldStatus,javax.swing.JTextField fieldSewa){
       if (comboJurusan.getSelectedIndex()==1) {
            jurusan = "TI";
            sewa = 10000;
            fieldSewa.setText(Integer.toString(sewa));
        
            if(!fieldStatus.equals(""))
            {
                int sewa = 0;

                sewa = Integer.parseInt(fieldSewa.getText());
            
                status = sewa / 2;
                fieldStatus.setText("" + status);
             }
        }else if (comboJurusan.getSelectedIndex()==2){
             
            jurusan = "Ekonomi";
            sewa = 20000;
            fieldSewa.setText(Integer.toString(sewa));
         
            if(!fieldStatus.equals(""))
            {
                int sewa = 0;

                sewa = Integer.parseInt(fieldSewa.getText());
            
                status = sewa / 2;
                fieldStatus.setText("" + status);
            }
        
        }else if(comboJurusan.getSelectedIndex()==3){
            jurusan = "Hukum";
            sewa = 30000;
            fieldSewa.setText(Integer.toString(sewa));
           
            //apabila field status sudah ada isinya dan jurusan diganti maka field status berubah
            if(!boxStatus.isSelected())
            {
                int sewa = 0;

                sewa = Integer.parseInt(fieldSewa.getText());
            
                status = sewa / 2;
                fieldStatus.setText("" + status);
            }
        }
        
   }
   
   
}
