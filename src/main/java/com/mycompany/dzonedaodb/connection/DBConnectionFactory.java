/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dzonedaodb.connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ZinoviouX
 */
public class DBConnectionFactory {
    
    public static final String URL = "jdbc:mysql://localhost:3306/bank?user=root&password=root";
    public static final String USER = "root";
    public static final String PASS = "root";
    public static Connection conn = null;
    //public static ResultSet rs;
    
    public static Connection getConnection(){
            
        if(conn == null){
                try{

                conn = DriverManager.getConnection(URL,USER,PASS);

            } catch(SQLException e){
                System.out.println("NO Connection with DB");
                e.printStackTrace();
            }
        }
                
        return conn;
    }
    
    public static void closeConnection(){
        
        try{
                conn.close();
            
        } catch(SQLException e){
            System.out.println("Caution : DB is still OPEN!");
        }
       
    }
        
         
    
}
