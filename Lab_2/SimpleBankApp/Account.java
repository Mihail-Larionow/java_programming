package com.michel.simplebankapp;

/**
 *
 * @author Михаил Ларионов
 */

/**
Объект класса <code> Account </code> имитирует банковский счет
*/
public class Account {
    private float balance = 0;
    private int id;
    private String details;
    
    public Account(int id){
        details = "None";
        this.id = id;
    }
    
    public Account(int id, String details){
        this.details = details;
        this.id = id;
    }
    
    /**
    Метод <em> deposit </em> обеспечивает пополнение денег на счет
     * @param money значение типа float 
    */
    public void deposit(float money){
        balance += money;
    }
    
    /**
    Метод <em> withdraw </em> обеспечивает снятие денег со счета
    */
    public void withdraw(float money){
        balance += -money;
    }
    
    
    /**
    Метод <em> withdraw </em> обеспечивает снятие денег со счета
     * @return возвращает значение типа float
    */
    public float getBalance(){
        return balance;
    }
    
    public int getCustomer(){
        return id;
    }
    
    public String getDetails(){
        return details;
    }
}
