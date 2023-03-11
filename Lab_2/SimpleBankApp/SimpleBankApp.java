package com.michel.simplebankapp;

/**
 *
 * @author Михаил Ларионов
 */
public class SimpleBankApp {

    public static void main(String[] args) {
        Account account = new Account(1, "Михаил 21 год");
        account.deposit(1000.10f);
        account.withdraw(199.99f);
        
        ATM atm = new ATM(1);
        
        System.out.print("ATM " + atm.getId() + ":\n" + atm.out(account)); 
    }
}
