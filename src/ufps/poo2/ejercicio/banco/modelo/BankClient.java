/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.poo2.ejercicio.banco.modelo;

import java.util.ArrayList;

/**
 *
 * @author crida
 */
public class BankClient {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ArrayList<Account> accounts = bank.getAccounts();

        
        bank.openAccount('S', 1234567);
        bank.openAccount('C', 2345678);
        bank.openAccount('S', 3456789);

        
        bank.deposit(1234567, 1000.0);
        bank.withdraw(2345678, 500.0);
        bank.deposit(3456789, 2000.0);

        
        System.out.println("Balance of account 1234567: " + bank.getBalance(1234567));
        System.out.println("Balance of account 2345678: " + bank.getBalance(2345678));
        System.out.println("Balance of account 3456789: " + bank.getBalance(3456789));

        
        bank.getMessageOverdraft();

        
        bank.closeAccount(2345678);

        
        bank.withdraw(2345678, 100.0);
    }
}
