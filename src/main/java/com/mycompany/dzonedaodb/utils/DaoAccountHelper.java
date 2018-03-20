/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dzonedaodb.utils;

import com.mycompany.dzonedaodb.connection.DBConnectionFactory;
import com.mycompany.dzonedaodb.domain.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ZinoviouX
 */
public class DaoAccountHelper implements DaoAccount{

    private Connection conn; 
    
    @Override
    public Account getAccount(String holderName, String holderSurname) {
        
        Account account = new Account();
        
        if(conn==null)
            conn = DBConnectionFactory.getConnection();
        
        try{
            
            String query = "SELECT * FROM accounts WHERE holder_name = ? AND holder_surname = ? ;";
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            
            
            //set parameters
            pstmt.setString(1,holderName);
            pstmt.setString(2,holderSurname);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){                
                account.setId(rs.getInt(1));
                account.setName(rs.getString(2));
                account.setSurname(rs.getString(3));
                account.setEmail(rs.getString(4));
                account.setBalance(rs.getDouble(5));
            }
            
            rs.close();
            DBConnectionFactory.closeConnection();
            
        } catch(SQLException e){
            
            e.printStackTrace();
        }
    
        conn = null;
        return account;
    }
    
    @Override
    public Account getAccount(int id) {
        
        Account account  = new Account();
        
        if(conn==null)
            conn = DBConnectionFactory.getConnection();
        
        try{
            
            String query = "SELECT * FROM accounts WHERE account_id = ? ;";
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            //set parameters
            pstmt.setInt(1,id);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){                
                account.setId(rs.getInt(1));
                account.setName(rs.getString(2));
                account.setSurname(rs.getString(3));
                account.setEmail(rs.getString(4));
                account.setBalance(rs.getDouble(5));
            }
            
            rs.close();
            DBConnectionFactory.closeConnection();
            
        } catch(SQLException e){
            
            e.printStackTrace();
        }
        
        conn = null;
        return account;
    }

    @Override
    public List<Account> getAllAccounts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account getAccountById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account getAccountByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
