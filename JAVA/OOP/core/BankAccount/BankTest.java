public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount mehdiAccount = new BankAccount();
        BankAccount mounaAccount = new BankAccount();
        BankAccount azizAccount = new BankAccount();

        System.out.println(BankAccount.getAccounts());

        
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        mehdiAccount.deposit(100, "checking");
        mehdiAccount.deposit(100, "savings");
        mehdiAccount.deposit(200, "checking");

        mounaAccount.deposit(50, "checking");
        mounaAccount.deposit(150, "savings");


        azizAccount.deposit(200, "checking");
        azizAccount.deposit(100, "savings");
        azizAccount.deposit(200, "checking");


      
       
      


        System.out.println("Checking Balance of Mehdi: " + mehdiAccount.getCheckingBalance());
        System.out.println("Savings Balance of Mehdi : " + mehdiAccount.getSavingsBalance());
        System.out.println("Checking Balance of Mouna: " + mounaAccount.getCheckingBalance());
        System.out.println("Savings Balance of Mouna : " + mounaAccount.getSavingsBalance());
        System.out.println("Checking Balance of Aziz: " + azizAccount.getCheckingBalance());
        System.out.println("Savings Balance of Aziz : " + azizAccount.getSavingsBalance());

        //testing withdraw and display  balance
        azizAccount.withdraw(50, "savings");
        azizAccount.displayBalance();
        azizAccount.withdraw(50, "checking");
        azizAccount.displayBalance();
        azizAccount.withdraw(3000, "checking");
        azizAccount.displayBalance();
        mehdiAccount.displayBalance();
        mehdiAccount.withdraw(50,"checking");
        mehdiAccount.displayBalance();



     
        System.out.printf("Total Accounts : %d - Total Money : $%.2f",BankAccount.getAccounts(),BankAccount.getTotalMoney());









        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        // Static Test (print the number of bank accounts and the totalMoney)
    }
}
