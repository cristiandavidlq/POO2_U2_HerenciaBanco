/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.poo2.ejercicio.banco.modelo;

/**
 *
 * @author crida
 */
public class SavingsAccount extends Account{
    private double interest;
    
    public SavingsAccount(int a) {
        this(a, 0.0);
    }
    
    public SavingsAccount(int a, double i){
        super(a);
        this.interest = i;
        
    }
    
    public void addInterest(float i){
        this.interest = i;
    }
    
    @Override
    public void deposit (double sum){
        if (sum > 0)
            super.deposit(sum +(getBalance()*interest));
        else
            System.err.println("SavingsAccount.deposit(...): " + "cannot deposit negative amount.");
    }
    
}
