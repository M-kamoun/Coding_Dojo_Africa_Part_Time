import java.util.ArrayList;

public class CoffeeKiosk{
    private ArrayList<Item> menu;
    private ArrayList<Order>orders;

    //Constructor
    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name,double price){
        Item newItem = new Item(name,price);
        menu.add(newItem);
        newItem.setIndex(menu.size()-1);

    }
    public void displayMenu(){
            for(Item item: menu){
            System.out.printf("%d %s -- $%.2f\n",item.getIndex(),item.getName(),item.getPrice());
        }
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();

    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equalsIgnoreCase("q")) {
            
            // Get the item object from the menu, and add the item to the order
            try {
                order.addItem(menu.get(Integer.parseInt(itemNumber)));
            } catch (IndexOutOfBoundsException | NumberFormatException e) { // we use The pipe symbol (|) to catch multiple exceptions.
                    System.out.println("Invalid item!");
               
            }
            
            
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
        order.display();
        orders.add(order); 
        
    }


   //addMenuItemByInput
//Create a method that lets an admin add menu items manually, using what you now know about getting user input.
    public void addMenuItemByInput(){

        System.out.println("Do you want to add a menu item or new order?\n(enter order or menu or q to quit)");
        String choice = System.console().readLine();
        
        while(!choice.equalsIgnoreCase("q")) {
            if(choice.equalsIgnoreCase("order")){
                newOrder();
            }else if(choice.equalsIgnoreCase("item")){
                System.out.println("Enter the name of the item:");
                String name = System.console().readLine();
                
                System.out.println("Enter the price of the item:");
                double price = Double.parseDouble(System.console().readLine());
                
                addMenuItem(name, price);
                
            }
            System.out.println("Do you want to add a menu item or new order?(enter q to quit)");
            choice = System.console().readLine();
        }


    }



    
}