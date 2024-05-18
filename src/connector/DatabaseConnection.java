/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static Connection con;
    static String url = "jdbc:mysql://localhost:3306/test";
    static String user = "root";
    static String password = "";
    
    public static Connection getConnection(){
        if (con == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,user,password);

                System.out.print(con + "bisa");
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("error"+ex);

            }
        }
        return con;
    }
}