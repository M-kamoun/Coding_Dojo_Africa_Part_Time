import java.util.ArrayList;
import java.text.*;
import java.util.Locale;

public class CafeUtil {


   //Implement the getStreakGoal method
   public int getStreakGoal(){
      int sum = 0;
      for(int i=1;i<=10;i++){

         sum+=i;
      }
         return sum;
   }

   //Implement the getStreakGoal method numWeeks
   public int getStreakGoal(int numWeeks){
      int sum = 0;
      for(int i=1;i<=numWeeks;i++){

         sum+=i;
      }
      return sum;
   }

   //Implement the getOrderTotal method
   public double getOrderTotal(double[] prices){
      double total = 0;
      for(double price : prices)
         total+=price;

      return total;


   }

   //Implement the displayMenu method

   void displayMenu(ArrayList<String> menuItems){
     for(int i=0;i<menuItems.size();i++)
        System.out.printf("%s - %s\n",i,menuItems.get(i));

      //for(String item:menuItems)
         //System.out.printf("%s - %s \n", menuItems.indexOf(item),item);


   }
   // Implement the addCustomer method
   public void addCustomer(ArrayList<String> customers){
      System.out.println("Please enter your name : ");
      String username = System.console().readLine();
      System.out.printf("HELLO %s, There are %s people ahead of you\n",username,customers.size());
      customers.add(username);
      System.out.println(customers);

   }

   //Ninja Bonus 1: Implement the printPriceChart method.
   void printPriceChart(String product, double price, int maxQuantity){
      System.out.println(product);
      DecimalFormat myFormatter = new DecimalFormat("$###,###.00",DecimalFormatSymbols.getInstance(Locale.US));
      for(int i=1;i<=maxQuantity;i++){
         System.out.printf("%s - %s\n",i,myFormatter.format(price*i));
      }
   }

   //Ninja bonus 2: Format the prices as currency.

   void printPriceChart2(String product, double price, int maxQuantity){
      System.out.println(product);
      DecimalFormat myFormatter = new DecimalFormat("$###,###.00",DecimalFormatSymbols.getInstance(Locale.US));
      double discount=0.0;
      for(int i=1;i<=maxQuantity;i++){
         System.out.printf("%s - %s\n",i,myFormatter.format(price*i-discount));
         discount+=0.5;
      }
   }

   //Ninja Bonus 3: Overload the displayMenu method.
   boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
      if (menuItems.size() != prices.size())
         return false;
      for (int i = 0; i < menuItems.size(); i++) {
         System.out.printf("%d %s --$%.2f\n", i, menuItems.get(i), prices.get(i));
      }

      return true;
   }

   //Ninja Bonus 4: Implement the addCustomers method.
    public void addCustomers(ArrayList<String> customers){

      while(true){
         System.out.println("Please enter your name (or q to exit): ");
         String username = System.console().readLine();
         if(username.equalsIgnoreCase("q")){
            break;
         }
         System.out.printf("HELLO %s, There are %s people ahead of you\n",username,customers.size());
         customers.add(username);
         System.out.println(customers);

      }


   }



   }
