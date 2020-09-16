/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DB {
    public static Connection getDB()
            throws SQLException,ClassNotFoundException{
       String hostName = "DESKTOP-SKTH6LI";
        String sqlInstanceName = "DESKTOP-SKTH6LI\\SQLEXPRESS";
        String database = "QUANLYDIEMVADETAITOTNGHIEP";
        String userName = "SA";
        String password = "123";


return getDB(hostName,sqlInstanceName,database,userName,password);        
    }
    public static Connection getDB(String hostName,String sqlInstanceName,String database,String userName,String password )
            throws ClassNotFoundException,SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://" + hostName+":1433" + ";instance=" + sqlInstanceName + ";databaseName=" + database;
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
        
    }

//    static Connection getSQLServerConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    static Connection getSQLServerConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
