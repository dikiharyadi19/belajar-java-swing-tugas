/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meeting7Tc;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ControllerExchange {
    
   
    private DefaultTableModel model;
    
    public ControllerExchange(){
       
       
    }
      ImageIcon clear = new ImageIcon("");
       String mata;
       int Tukar,NilaiTukar;
       int totalJumlahTukar,totalNilaiTukar;
       
       public void getTotalJumlahTukar(javax.swing.JTextField fieldTotalPertukaranUang,javax.swing.JTextField fieldTotalNilaiTukar,javax.swing.JTable tbExchange){
        int rowsCount=tbExchange.getRowCount();
        totalJumlahTukar=0;
        for(int i=0; i<rowsCount; i++){

            totalJumlahTukar+=Integer.parseInt(tbExchange.getValueAt(i, 0).toString());
            fieldTotalPertukaranUang.setText(Integer.toString(totalJumlahTukar));

        }
        }
       public void getTotalNilaiTukar(javax.swing.JTextField fieldTotalPertukaranUang,javax.swing.JTextField fieldTotalNilaiTukar,javax.swing.JTable tbExchange){
        int rowsCount=tbExchange.getRowCount();
        totalNilaiTukar=0;
        for(int i=0; i<rowsCount; i++){
            totalNilaiTukar=totalNilaiTukar+Integer.parseInt(tbExchange.getValueAt(i, 1).toString());
              fieldTotalNilaiTukar.setText(Integer.toString(totalNilaiTukar));

        }
        
        }
       
       
    public void RadioNegara(javax.swing.JRadioButton radioPrancis,javax.swing.JRadioButton radioJepang,javax.swing.JRadioButton radioAmerika,javax.swing.JLabel labelBendera,javax.swing.JLabel labelMataUang){
        if(radioAmerika.isSelected()){
             ImageIcon img = new ImageIcon("src/meeting7/images/amerika.png");
            labelBendera.setIcon(img);
            
            
            ImageIcon img2 = new ImageIcon("src/meeting7/images/dollar.png");
            labelMataUang.setIcon(img2);   
        }
            if (radioJepang.isSelected()) {
            ImageIcon img = new ImageIcon("src/meeting7/images/japan.png");

            labelBendera.setIcon(img);

            ImageIcon img2 = new ImageIcon("src/meeting7/images/yen.png");

            labelMataUang.setIcon(img2);
        }
        
            if (radioPrancis.isSelected()) {
            ImageIcon img = new ImageIcon("src/meeting7/images/flagFrance.png");
            labelBendera.setIcon(img);

            ImageIcon img2 = new ImageIcon("src/meeting7/images/euro.png");
            labelMataUang.setIcon(img2);
        }   
        
    }
    public void ComboBank(javax.swing.JComboBox comboMandiri,javax.swing.JComboBox comboBca,javax.swing.JLabel lblMataUang1,javax.swing.JLabel lblMataUang2,javax.swing.JTextField fieldBca,javax.swing.JTextField fieldMandiri){
        if(comboMandiri.isLightWeightPopupEnabled()){
             switch (comboMandiri.getSelectedIndex()) {
            case 1:
                fieldMandiri.setText("9150");
                lblMataUang1.setText("Dollar");
                comboBca.setSelectedIndex(1);
                mata="Dollar";
                break;
            case 2:
                fieldMandiri.setText("122");
                lblMataUang1.setText("Yen");
                comboBca.setSelectedIndex(2);
                mata="Yen";
                break;
            case 3:
                fieldMandiri.setText("13980");
                lblMataUang1.setText("Euro");
                comboBca.setSelectedIndex(3);
                mata="Euro";
                break;
            default:
                fieldMandiri.setText("");
                mata="Error";
                lblMataUang1.setText("MataUang");
                lblMataUang2.setText("MataUang");
                fieldBca.setText("");
               break;
        } 
       
        }
        
        if(comboBca.isLightWeightPopupEnabled()){
            switch (comboBca.getSelectedIndex()) {
            case 1:
                fieldBca.setText("9200");
                lblMataUang2.setText("Dollar");
                break;
            case 2:
                fieldBca.setText("123");
                lblMataUang2.setText("Yen");
                break;
            case 3:
                fieldBca.setText("13970");
                lblMataUang2.setText("Euro");
                break;
            default:
                fieldBca.setText("");
                lblMataUang2.setText("MataUang");
                break;
         
        }     
        }
    }
    public void NilaiTukar(javax.swing.JTable tbExchange,java.awt.event.KeyEvent evt,javax.swing.JComboBox comboMandiri,javax.swing.JComboBox comboBca,javax.swing.JTextField fieldMandiri,javax.swing.JTextField fieldBca,javax.swing.JTextField fieldTukar,javax.swing.JTextField fieldNilaiTukar,javax.swing.JLabel lblMata){
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (comboMandiri.getSelectedIndex() == comboBca.getSelectedIndex()) {
                int kursBca, kursMandiri;
                
                kursMandiri = Integer.parseInt(fieldMandiri.getText());
                kursBca = Integer.parseInt(fieldBca.getText());
                Tukar = Integer.parseInt(fieldTukar.getText());

                if (kursBca >= kursMandiri) {
                    NilaiTukar=Tukar / kursBca;
                    fieldNilaiTukar.setText("" + NilaiTukar);

                } else {
                    NilaiTukar=Tukar / kursBca;
                    fieldNilaiTukar.setText("" + NilaiTukar);
                }
                switch (comboMandiri.getSelectedIndex() & comboBca.getSelectedIndex()) {
                    case 1:
                        lblMata.setText("Dollar");
                        break;
                    case 2:
                        lblMata.setText("Yen");
                        break;
                    case 3:
                        lblMata.setText("Euro");
                        break;
                    default:
                        lblMata.setText("Mata Uang");
                        break;

                }

            } else {
                JOptionPane.showMessageDialog(null, "Samakan Terlebih Dahulu Nilai Tukar Valas'nya \n & Jumlah Uang tukar tidak boleh kosong");
            }
            
              model=(DefaultTableModel) tbExchange.getModel();
              Object[] row={Tukar,NilaiTukar};
              model.addRow(row);
                     }else{
            fieldNilaiTukar.setText("");
            
        }
    }
    public void Perbedaan(javax.swing.JTextField fieldMandiri,javax.swing.JTextField fieldBca,javax.swing.JTextField fieldBeda,javax.swing.JCheckBox boxPerbedaan){
           if (!fieldMandiri.getText().equals("") && !fieldBca.getText().equals("") ) {
            if (boxPerbedaan.isSelected()) {
                int mandiri = Integer.parseInt(fieldMandiri.getText());
                int bca = Integer.parseInt(fieldBca.getText());
                

                if (mandiri <= bca) {
                    fieldBeda.setText("Kurs " + mata + " diBank Mandiri Lebih Murah dari Bca");
                } else {
                    fieldBeda.setText("Kurs " + mata + " diBank Bca Lebih Murah dari Mandiri");
                }
            } else {
                fieldBeda.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tentukan Terlebih dahulu Nilai Tukar Valas !!");
        }
    }
    public void Clear(javax.swing.ButtonGroup buttonGroup1,javax.swing.JLabel labelBendera,javax.swing.JLabel labelMataUang,javax.swing.JComboBox comboMandiri,javax.swing.JTextField fieldMandiri,javax.swing.JComboBox comboBca,javax.swing.JTextField fieldBca,javax.swing.JTextField fieldTukar,javax.swing.JTextField fieldNilaiTukar,javax.swing.JTextField fieldBeda,javax.swing.JCheckBox boxPerbedaan){
         buttonGroup1.clearSelection();
        labelBendera.setIcon(clear);
        labelMataUang.setIcon(clear);
        comboMandiri.setSelectedIndex(0);
        fieldMandiri.setText("");
        comboBca.setSelectedIndex(0);
        fieldBca.setText("");
        fieldTukar.setText("");
        fieldNilaiTukar.setText("");
        fieldBeda.setText("");
        boxPerbedaan.setSelected(false);
    }
}
