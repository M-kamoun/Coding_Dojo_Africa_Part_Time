public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk cofeeKiosk = new CoffeeKiosk();
        cofeeKiosk.addMenuItem("banana", 2.00);
        cofeeKiosk.addMenuItem("coffee", 1.50);
        cofeeKiosk.addMenuItem("latte", 4.50); //
        cofeeKiosk.addMenuItem("capuccino", 3.00);
        cofeeKiosk.addMenuItem("muffin", 4.00); //

       
        cofeeKiosk.newOrder();
        cofeeKiosk.addMenuItemByInput();
        cofeeKiosk.newOrder();





    }

}
