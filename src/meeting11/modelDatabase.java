/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meeting11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class modelDatabase {
    private final Koneksi koneksi=new Koneksi();
    private int id;
    private String nim,nama,semester;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public boolean update(){
        boolean message = false;
        
        Connection connection;
        
        if((connection=koneksi.getConnetion()) !=null){
            String sqlQuery="";
            PreparedStatement ps;
            ResultSet rset;
            
            try{
                sqlQuery="update tb_pertemuan set nim=?,nama=?,semseter=? where id=?";
                
                ps=connection.prepareStatement(sqlQuery);
                ps.setString(1, nim);
                ps.setString(2, nama);
                ps.setString(3, semester);
                ps.setInt(4, id);
                ps.executeUpdate();
                ps.close();
                connection.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
            
        }
        
        
        return message;
        
    }
}
