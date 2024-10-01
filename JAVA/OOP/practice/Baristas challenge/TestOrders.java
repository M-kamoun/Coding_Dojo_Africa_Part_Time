public class TestOrders {
    public static void main(String[] args) {

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("jimmy");
        Order order5 = new Order("Sam");







        Item item1 = new Item("Mocha",3.5);
        
        Item item2 = new Item("Cappuccino",4.99);

        Item item3 = new Item("latte",3.5);
        
        Item item4 = new Item("drip coffee",2.5);


        order1.addItem(item4);
        order1.addItem(item3);

        order2.addItem(item4);
        order2.addItem(item4);
        order2.addItem(item3);

        order3.addItem(item1);
        order3.addItem(item2);
        order3.addItem(item1);

        order4.addItem(item4);
        order4.addItem(item2);

        order5.addItem(item4);
        order5.addItem(item3);
        order5.addItem(item2);

        //Test your getStatusMessage method by setting some orders to ready and printing the messages for each order.

        order1.isReady();
        order3.isReady();

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());


        System.out.println(order3.getOrderTotal());

        //call the display method on all of your orders.

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();




        

       


        





        




}
}
