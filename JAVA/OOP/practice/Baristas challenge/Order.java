import java.util.ArrayList;

public class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    //Add a constructor to your Order class that takes no arguments, but sets the name to "Guest" and initializes the items array to an empty ArrayList<Item>
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
        
        
        
    }

    //Add an overloaded constructor for Order that takes String name as an argument, so you can create an instance with a name.
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
        
    }

    //accessors methods
    public String getName() {
        return name;
    }
    
    public boolean isReady() {
        return ready;
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }


    // mutator methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    
    public void setItems(ArrayList<Item> items) {
        this.items=items;
    }

    //Create a method called addItem that takes an Item object as an argument and adds the item to the order's items array. No need to return anything.

    public void addItem(Item item){
        items.add(item);
    }

    //Create a method called getStatusMessage that returns a String message. If the order is ready, return "Your order is ready.", if not, return "Thank you for waiting. Your order will be ready soon."

    public String getStatusMessage(){
        if(ready){
            return "Your order is ready.";
        }else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    
   //Similar to the getOrderTotal method from the Cafe Business Logic assignment, create a method called getOrderTotal that sums together each of the item's prices, and returns the total amount.


public double getOrderTotal(){
    double total = 0.0;
    for(Item item : items)
       total+=item.getPrice();

    return total;


 }

 //Similar to the displayMenu function from the Cafe Business Logic assignment, create a method called display that prints out the order information like so:
 /* Customer Name: Cindhuri
 drip coffee - $1.50
 capuccino - $3.50
 Total: $5.00*/
 
 public void display(){
    System.out.println("Customer Name: " + name);
    for(Item item : items){
        System.out.printf("%s - $%.2f\n",item.getName(), item.getPrice());
    }
       
    System.out.printf("Total: $%.2f\n",getOrderTotal());
 }







}