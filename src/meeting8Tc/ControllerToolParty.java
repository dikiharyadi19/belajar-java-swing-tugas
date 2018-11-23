/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meeting8Tc;

import com.sun.glass.events.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ControllerToolParty {
   private DefaultTableModel model;
    public ControllerToolParty(){
        
    }
    String nama, alamat, tgl, peralatanSewa,peralatanSewa1,peralatanSewa2,peralatanSewa3;
    
    int lama, kembali, hargaTenda=0, hargaStage=0, hargaMeja=0, biayaSewa, denda=0, dp, sisaPembayaran;
    int totalBiayaSewa=0;
    ImageIcon clear = new ImageIcon("");
    
    public int getSum(javax.swing.JTable tableRental){
        int rowsCount=tableRental.getRowCount();
        int sum=0;
        for(int i=0; i<rowsCount; i++){
            sum=sum+Integer.parseInt(tableRental.getValueAt(i, 5).toString());
        }
        return sum;
    }
    
    public void hitung(javax.swing.JTextField fieldBiayaSewa,javax.swing.JTextField fieldLamaSewa,javax.swing.JTextField fieldLamaKembali,javax.swing.JTextField fieldDenda) {
        
        biayaSewa = hargaTenda+ hargaStage + hargaMeja;
       
        fieldBiayaSewa.setText(Integer.toString(biayaSewa));
        lama = Integer.parseInt(fieldLamaSewa.getText());
        kembali = Integer.parseInt(fieldLamaKembali.getText());
        
        int dendaHari;
        dendaHari = biayaSewa / 2;
        denda = (kembali - lama) * dendaHari;
        fieldDenda.setText(Integer.toString(denda));
       
    }    
    public void ToolParty(javax.swing.JTextField fieldLamaSewa,javax.swing.JTextField fieldLamaKembali,javax.swing.JTextField  fieldDenda,javax.swing.ButtonGroup groupTenda,javax.swing.ButtonGroup groupStage,javax.swing.ButtonGroup groupMeja , javax.swing.JCheckBox boxTenda,javax.swing.JCheckBox boxStage,javax.swing.JCheckBox boxMeja,javax.swing.JLabel lblTenda,javax.swing.JLabel lblStage,javax.swing.JLabel lblMeja,javax.swing.JPanel panelTenda,javax.swing.JPanel panelStage,javax.swing.JPanel panelMeja,javax.swing.JRadioButton radio6x6,javax.swing.JRadioButton radio10x10,javax.swing.JTextField fieldHargaTenda,javax.swing.JTextField fieldHargaStage,javax.swing.JTextField fieldHargaMeja,javax.swing.JRadioButton radio4x6,javax.swing.JRadioButton radio6x10,javax.swing.JRadioButton radio20set,javax.swing.JRadioButton radio50set,javax.swing.JTextField fieldBiayaSewa){
         if (boxTenda.isSelected()) {
            peralatanSewa1= "Tenda";
            ImageIcon tenda = new ImageIcon("src/meeting8Tc/tenda.png");
            lblTenda.setIcon(tenda);
            panelTenda.setVisible(true);
            
            hargaTenda=0;
            fieldHargaTenda.setText(Integer.toString(hargaTenda));
        } else {
            lblTenda.setIcon(clear);
            
            biayaSewa -=hargaTenda;
            fieldBiayaSewa.setText(Integer.toString(biayaSewa));
            hargaTenda=0;
            peralatanSewa1= " ";
            groupTenda.clearSelection();
            panelTenda.setVisible(false);

        }
         //
         if (radio6x6.isSelected()) {
            hargaTenda = 5000000;

            fieldHargaTenda.setText(Integer.toString(hargaTenda));
        hitung( fieldBiayaSewa,fieldLamaSewa,fieldLamaKembali,fieldDenda
       );
        }
         //
        if (radio10x10.isSelected()) {
            hargaTenda = 7000000;

            fieldHargaTenda.setText(Integer.toString(hargaTenda));
            hitung(fieldBiayaSewa,fieldLamaSewa,fieldLamaKembali,fieldDenda);
        }
        // //stage
         if (boxStage.isSelected()) {
            peralatanSewa2 = ", Stage";
            ImageIcon tenda = new ImageIcon("src/meeting8Tc/Stage.png");
            lblStage.setIcon(tenda);
            panelStage.setVisible(true);
            hargaStage=0;
            fieldHargaStage.setText(Integer.toString(hargaStage));
        } else {
            biayaSewa -=hargaStage;
            fieldBiayaSewa.setText(Integer.toString(biayaSewa));
            hargaStage=0;
            peralatanSewa2= " ";
            
            groupStage.clearSelection();
            lblStage.setIcon(clear);
            panelStage.setVisible(false);

        }
         //
          if (radio4x6.isSelected()) {
            hargaStage = 10000000;

            fieldHargaStage.setText(Integer.toString(hargaStage));
            hitung(fieldBiayaSewa,fieldLamaSewa,fieldLamaKembali,fieldDenda);
        }
         if (radio6x10.isSelected()) {
            hargaStage = 15000000;

            fieldHargaStage.setText(Integer.toString(hargaStage));
            hitung(fieldBiayaSewa,fieldLamaSewa,fieldLamaKembali,fieldDenda);
        }
         //meja
          if (boxMeja.isSelected()) {
            peralatanSewa3 = ", Meja-Kursi";
            ImageIcon tenda = new ImageIcon("src/meeting8Tc/meja.png");
            lblMeja.setIcon(tenda);
            panelMeja.setVisible(true);
            
            hargaMeja=0;
            fieldHargaMeja.setText(Integer.toString(hargaMeja));
        } else {
            biayaSewa -=hargaMeja;
            fieldBiayaSewa.setText(Integer.toString(biayaSewa));
            hargaMeja=0;
            peralatanSewa3= " ";
            
            groupMeja.clearSelection();
            lblMeja.setIcon(clear);
            panelMeja.setVisible(false);

        }
           if (radio20set.isSelected()) {
            hargaMeja = 4000000;

            fieldHargaMeja.setText(Integer.toString(hargaMeja));
            hitung(fieldBiayaSewa,fieldLamaSewa,fieldLamaKembali,fieldDenda);
        }
         if (radio50set.isSelected()) {
            hargaMeja = 8000000;

            fieldHargaMeja.setText(Integer.toString(hargaMeja));
            hitung(fieldBiayaSewa,fieldLamaSewa,fieldLamaKembali,fieldDenda);
        }
          
         
         
         
         
    }
    public void Dp(java.awt.event.KeyEvent evt ,javax.swing.JTextField fieldNama,javax.swing.JTextField fieldDp,javax.swing.JTextField fieldTotalSewa,javax.swing.JTextField fieldTotalPendapatan,javax.swing.JTable tableRental){
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            nama = fieldNama.getText();

            totalBiayaSewa = biayaSewa + denda;
            dp=Integer.parseInt(fieldDp.getText());
            
            fieldTotalSewa.setText(Integer.toString(totalBiayaSewa));
            
            sisaPembayaran=biayaSewa-dp;
            
            peralatanSewa=peralatanSewa1+peralatanSewa2+peralatanSewa3;
            model=(DefaultTableModel) tableRental.getModel();
            Object[] row = {nama, peralatanSewa, biayaSewa, denda, dp, totalBiayaSewa, sisaPembayaran};
            model.addRow(row);
            fieldTotalPendapatan.setText(Integer.toString(getSum(tableRental)));
        }
    }
    public void Clear(javax.swing.JTextField fieldTotalPendapatan,javax.swing.JTextField fieldNama,javax.swing.JTextField fieldAlamat,com.toedter.calendar.JDateChooser dateDate,javax.swing.JTextField fieldLamaSewa,javax.swing.JTextField fieldLamaKembali,javax.swing.JTextField fieldDenda,javax.swing.JTextField fieldDp,javax.swing.JTextField fieldBiayaSewa,javax.swing.JTextField fieldTotalSewa,javax.swing.JTextField fieldHargaTenda,javax.swing.JTextField fieldHargaStage,javax.swing.JTextField fieldHargaMeja,javax.swing.ButtonGroup groupTenda,javax.swing.ButtonGroup groupStage,javax.swing.ButtonGroup groupMeja,javax.swing.JCheckBox boxTenda,javax.swing.JCheckBox boxStage,javax.swing.JCheckBox boxMeja,javax.swing.JPanel panelTenda,javax.swing.JPanel panelStage,javax.swing.JPanel panelMeja,javax.swing.JLabel lblTenda,javax.swing.JLabel lblStage,javax.swing.JLabel lblMeja){
        fieldTotalPendapatan.setText("");
        fieldNama.setText("");
        fieldAlamat.setText("");
        dateDate.setDate(null);
        fieldLamaSewa.setText("");
        fieldLamaKembali.setText("");
        
        groupTenda.clearSelection();
        boxTenda.setSelected(false);
        
        groupStage.clearSelection();
        boxStage.setSelected(false);
        
        groupMeja.clearSelection();
        boxMeja.setSelected(false);
        
        fieldBiayaSewa.setText("");
        fieldDenda.setText("");
        fieldDp.setText("");
        fieldBiayaSewa.setText("");
        fieldTotalSewa.setText("");
        
        fieldHargaTenda.setText("");
        fieldHargaStage.setText("");
        fieldHargaMeja.setText("");
        
        groupTenda.clearSelection();
        groupStage.clearSelection();
        groupMeja.clearSelection();
        
        lblTenda.setIcon(clear);
        panelTenda.setVisible(false);
        
        lblStage.setIcon(clear);
        panelStage.setVisible(false);
            
        lblMeja.setIcon(clear);
        panelMeja.setVisible(false);
        
        nama="";
        alamat="";
        tgl="";
        peralatanSewa="";
        lama=0;
        kembali=0;
        hargaTenda=0;
        hargaStage=0;
        hargaMeja=0;
        biayaSewa=0;
        denda=0;
        dp=0; 
        totalBiayaSewa=0;
        sisaPembayaran=0;
    }
}
