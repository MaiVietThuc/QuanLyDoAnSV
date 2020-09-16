/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectdatabase;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */

public class GetConnectionUtils {
    
    public static Connection getDB() throws SQLException,ClassNotFoundException{
        return DB.getDB();
    }


    
}
