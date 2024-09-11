/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.poo2.ejercicio.banco.modelo;

/**
 *
 * @author crida
 */
public class CurrentAccount extends Account{
    private double overdraftLimit;
    
    public CurrentAccount(int a) {
        this(a, 0.0);
    }
    
    public CurrentAccount(int a, double o){
        super(a);
        this.overdraftLimit = o;
    }
    
    @Override
    public void withdraw(double sum) {
		if (sum > 0)
			if(getBalance()+overdraftLimit-sum >= 0)
                            super.withdraw(sum);
                        else
                            System.err.println("CurrentAccount.withdraw(...): " + "cannot withdraw exceeds the overdraft limit.");
		else
			System.err.println("CurrentAccount.withdraw(...): " + "cannot withdraw negative amount.");
    }
}
