public class Item {
    private String name;
    private double price;


//Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

// accessor methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    // mutator methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    
    
    
}
