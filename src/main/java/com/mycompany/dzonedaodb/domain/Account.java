/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dzonedaodb.domain;

/**
 *
 * @author ZinoviouX
 */
public class Account {
    
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private Double balance;
    
    

    public Account(Integer id, String name, String surname, String email, Double balance){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.balance = balance;
    }
    
    public Account(){
        this(null,null,null,null,null);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    public String toString(){
        return "ID : " + id + ", "+ name + " " + surname + ", " + email + ", Balance : " + balance;
    }
    
    public void showInfo(){
            System.out.println("----------------------------\n");
            System.out.println("ID : " + id);
            System.out.println("Name : " + name);
            System.out.println("Surname : " + surname);
            System.out.println("Email :  " + email);
            System.out.println("Balance : " + balance);
            System.out.println("\n----------------------------");
    }
    }
