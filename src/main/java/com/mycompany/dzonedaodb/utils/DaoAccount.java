/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dzonedaodb.utils;

import com.mycompany.dzonedaodb.domain.Account;
import java.util.List;

/**
 *
 * @author ZinoviouX
 */
public interface DaoAccount {
    
   public Account getAccount(String holderName, String holderSurname);
   public Account getAccount(int id);
   public List<Account> getAllAccounts();
   public Account getAccountById();
   public Account getAccountByName();
   public boolean insertAccount();
   public boolean updateAccount();
   public boolean deleteAccount();
    
}
