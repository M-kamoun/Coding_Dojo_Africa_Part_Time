import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber; // unique identifier for each bank account

    //Class variables "static variables"
    private static int accounts=0;
    private static double totalMoney=0.0; // refers to the sum of all bank account checking and savings balances

//random id generator String
    private static String randomId(){
        Random r = new Random();
        StringBuilder numberAccount = new StringBuilder(); //creating a mutable sequence of characters.
        for(int i=0; i<10; i++){
            numberAccount.append(r.nextInt(10)); // appending a random digit from 0 to 9 to the sequence.
        }
        return numberAccount.toString(); // converting the sequence to a string.
    }
    

    // CONSTRUCTOR
    // Be sure to increment the number of accounts

    public BankAccount(){
        accounts++;
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = BankAccount.randomId();
       
    }

    // GETTERS
        // for checking, savings, accounts, and totalMoney
    
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }
    
    public static int getAccounts(){
        return accounts;
    }
    
    public static double getTotalMoney(){
        return totalMoney;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    
    
    
    
    
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account

    public void deposit(double amount, String accountType){
        if(amount>0){ // to ensure that the amount is positive
            if(accountType.equalsIgnoreCase("checking")){
                checkingBalance += amount;
               
            } else {
                savingsBalance += amount;
              
            }
            totalMoney += amount;
        }
        
    }

    
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    

    public void withdraw(double amount, String accountType){
        
            if(accountType.equalsIgnoreCase("checking")){
                if(amount<=checkingBalance){
                    checkingBalance -= amount;
                    totalMoney -= amount;
                }
                else {
                    System.out.println("Insufficient funds");
                }  
                
            } 
                else if(amount<=savingsBalance){
                    savingsBalance -= amount;
                    totalMoney -= amount;
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }  
                    
                
            }

           
            // getBalance
    // - display total balance for checking and savings of a particular bank account

    public void displayBalance(){
        System.out.printf(" Savings: %.2f, Checking: %.2f\n", this.savingsBalance, this.checkingBalance);
    }
            
        }
    
    
    
   

