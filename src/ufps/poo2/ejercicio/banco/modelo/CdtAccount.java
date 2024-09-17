/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.poo2.ejercicio.banco.modelo;

/**
 *
 * @author Estudiante
 */
public class CdtAccount extends Account{
    
    double interest;
    int dias;
    

    public CdtAccount(int a) {
        this(a, 0.0);
    }
    
    public CdtAccount(int a, double i){
        super(a);
        this.interest = i;
    }
    
    @Override
    public void withdraw(double sum) {
		if (sum > 0 ){
                    if(sum<=getBalance()){
                        super.withdraw(sum);                    
                    }else{
                        System.err.println("CdtAccount.withdraw(...): " + "cannot withdraw superior amount to balance.");
                    }
                   
                }
			
		else
			System.err.println("CdtAccount.withdraw(...): " + "cannot withdraw negative amount.");
    }
    
    @Override
    public double getBalance() {
        double bal = getBalance(); 
	return bal+(bal*interest*dias);
    }
}
