/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dzonedaodb.testing;

import com.mycompany.dzonedaodb.connection.DBConnectionFactory;
import com.mycompany.dzonedaodb.domain.Account;
import com.mycompany.dzonedaodb.utils.DaoAccount;
import com.mycompany.dzonedaodb.utils.DaoAccountHelper;
import java.sql.Connection;
import static java.time.temporal.TemporalAdjusters.previous;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ZinoviouX
 */
public class DZoneTester {
    
    public static void main(String[] args){
        
        List<Account> accounts;    
        DaoAccount dao = null;
        
        Scanner sc = new Scanner(System.in);
        int choice;
        
        while(true){
            System.out.println("Options");
            System.out.println("1. Select Account by name & surname");
            System.out.println("2. Select Account by id");
            System.out.println("3. Insert new Account");
            System.out.println("4. Update Account");
            System.out.println("5. Delete Account");
            System.out.println("6.Exit");
            System.out.println("Your selection : ");
            
            try{
                choice = Integer.parseInt(sc.nextLine());
                
            } catch(Exception e){
                
                System.out.println("Use only numeric values");
                return;
            }
            
            switch(choice){
                
                case 1:
                    dao = new DaoAccountHelper();
                    
                    System.out.println("Enter name");
                    String holderName = sc.nextLine();
                    
                    System.out.println("Enter surname");
                    String holderSurname = sc.nextLine();
                    
                    Account account = dao.getAccount(holderName, holderSurname);
                    account.showInfo();
                    dao=null;
                break;
                
                
                    
                case 2:
                    dao = new DaoAccountHelper();
                    System.out.println("Enter ID");
                    int id = Integer.parseInt(sc.nextLine());
                    
                    account = dao.getAccount(id);
                    account.showInfo();
                    dao = null;
                    break;
                    
                case 3: case 4: case 5: case 6: 
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            
        }
        
        
       
    }
    
}
