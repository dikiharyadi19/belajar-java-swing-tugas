/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meeting11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Koneksi {
//    executeQuery() untu membaca table;
//  executeUpdate() untuk menulis ke table;
//
    private final String url="jdbc:postgresql://localhost/pemrograman";
    private final String user="postgres";
    private final String password="1111";
    
    public Connection getConnetion(){
        Connection conn=null;
        
        try{
            conn=DriverManager.getConnection(url,user,password);
            System.out.println("Succesfully Connected to server");
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return conn;
 
       
    }
     
    
}
