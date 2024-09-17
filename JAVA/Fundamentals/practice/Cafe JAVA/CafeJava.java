public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.5;
        double lattePrice = 5.5;
         double cappuccinoPrice = 6.25;
        
        // Customer order variables (add yours below)   

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        // Example:
        // first customer 
        System.out.println(customer1+pendingMessage);
        System.out.println("****************************************************************");
      
        //Noah ordered a cappucino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.
        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4){
            System.out.println(readyMessage);
            System.out.println(displayTotalMessage+cappuccinoPrice);
        } else {
            System.out.println(customer4+pendingMessage);
        }

        //Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        System.out.println("****************************************************************");
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage+ 2*lattePrice);

        if(isReadyOrder2)
            System.out.println(readyMessage);
        else 
            System.out.println(customer2+pendingMessage);
        

        

//Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.
System.out.println("****************************************************************");
System.out.println(displayTotalMessage + (lattePrice-dripCoffeePrice) );


    }
}


