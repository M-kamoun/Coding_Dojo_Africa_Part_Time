import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {

    /*
      You will need add 1 line to this file to create an instance
      of the CafeUtil class.
      Hint: it will need to correspond with the variable name used below..
    */

        CafeUtil appTest = new CafeUtil();
        int numWeeks = 20;

        /* ============ App Test Cases ============= */

        System.out.println("\n----- Streak Goal Test -----");
       System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());
        System.out.printf("Purchases needed by week %d: %s \n\n",numWeeks, appTest.getStreakGoal(numWeeks));

        // System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};

        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));

        // System.out.println("----- Display Menu Test-----");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        // System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();


        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
         appTest.addCustomer(customers);
         System.out.println("\n");
         }
        appTest.printPriceChart("Columbian Coffee Grounds",15,3);
        appTest.printPriceChart2("Columbian Coffee Grounds",2,4);

        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(1.5);
        prices.add(3.5);
        prices.add(4.5);
        prices.add(3.5);





        if(!appTest.displayMenu(menu,prices)){
            System.out.println("Menu table and Prices table are not the same size!");
        }


            appTest.addCustomers(customers);


    }

}

