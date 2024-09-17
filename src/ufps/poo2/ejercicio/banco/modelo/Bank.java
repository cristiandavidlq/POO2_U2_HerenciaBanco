package ufps.poo2.ejercicio.banco.modelo;
import java.util.ArrayList;

public class Bank {
    
   private ArrayList<Account> accounts;

   public Bank() {
   }
   
   public void deposit(int a, double sum){
       Account account = findAccount(a);
       
       if(account!=null)
           account.deposit(sum);
       else
           System.err.println("Bank.deposit(...): " + "cannot deposit to non-existent account.");
   }
   
   public void withdraw(int a, double sum) {
	Account account = findAccount(a);
        
        if(account!=null)
            account.withdraw(sum);
        else
           System.err.println("Bank.withdraw(...): " + "cannot withdraw to non-existent account.");
   }
   
   public double getBalance(int a){
       Account account = findAccount(a);
       
       if(account==null)
           System.err.println("Bank.withdraw(...): " + "cannot withdraw to non-existent account.");           
       
       return account.getBalance();
   }    
   
   public void getMessageOverdraft(){
       for(Account account : accounts){
           if(account.getClass().getName().equals("CurrentAccount"))
               if(account.getBalance()<0)
                   System.out.println("The account "+account.getAccountNumber()+" is overdrawn");                        
       }
   }
   
   public void openAccount(char t, int a){
       Account account;
       if(t=='S'){
           account = new SavingsAccount(a);
           accounts.add(account);
       }
       if(t=='C'){
           account = new CurrentAccount(a);
           accounts.add(account);
       }    
       if(t=='D'){           
           account = new CdtAccount(a);
           accounts.add(account);
       }
   }
      
   public void closeAccount(int a){
        for (int i = 0; i < accounts.size(); i++) {
            
            if (accounts.get(i).getAccountNumber() == a) {
                Object account = accounts.get(i);
                if(account instanceof CdtAccount){
                    CdtAccount acc = (CdtAccount) account;                    
                    transferirSaldo(acc.getBalance(), a);
                }
                accounts.remove(i);
                
                for (int j = i; j < accounts.size() - 1; j++) {
                    accounts.set(j, accounts.get(j + 1));
                }
                
                accounts.remove(accounts.size() - 1);
                return;
            }
        }
   }
   
   private void transferirSaldo(double bal, int a){
       private void transferirSaldo(double bal, int a){
       Account cuenta= findAccount(a);
       cuenta.deposit(bal);
   }
   }
   
   private Account findAccount(int a){
       for(Account account : accounts){
           if(account.getAccountNumber()==a)
               return account;         
       }
       return null;
   }
   
   public ArrayList<Account> getAccounts() {
        return accounts;
    }
   
}
