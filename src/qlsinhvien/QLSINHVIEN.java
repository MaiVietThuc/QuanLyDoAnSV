/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;


import conectdatabase.GetConnectionUtils;
import gui.FLogin;
import gui.FGV_HD_PB;
import java.sql.Connection;
import java.sql.SQLException;



/**
 *
 * @author ASUS
 */
public class QLSINHVIEN {

    /**
     * @param args the command line arguments 
     * @throws java.sql.SQLException 
     * @throws java.lang.ClassNotFoundException 
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
      //  FGV_HD_PB f=new FGV_HD_PB();
        
        FLogin f=new FLogin();
        f.setVisible(true);
      
        Connection conn = GetConnectionUtils.getDB();
        System.out.println("GetConnection: "+conn);
        System.out.println("Connection Success");
       
//        Connection conn = GetConnectionUtils.getDB();
//        if (conn == null) {
//            System.out.println("something wrong");
//        } else {
//            System.out.println("ok");
//        }
    }
    
}
