package com.michel.simplebankapp;

/**
 *
 * @author Михаил Ларионов
 */

/**
Объект класса <code> ATM </code> имитирует банкомат
*/
public class ATM {
    
    int id;
    
    public ATM(int id){
        this.id = id;
    }
    
    public String out(Account account){
        String info;
        info = "Account " + account.getCustomer() + ": " 
                + account.getBalance() + "\nAccount details: " 
                + account.getDetails();
        return info;
    }
    
    public int getId(){
        return id;
    }
}
