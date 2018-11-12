/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKSHAY
 */
import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    Connection con;
    public static Connection connectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:D:\\Database\\lms.sqlite");
            return con;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Please Copy and Paste Database Directory to 'D' Drive to Work With Library Management System...!!!");
            return null;
        }
    }
}
