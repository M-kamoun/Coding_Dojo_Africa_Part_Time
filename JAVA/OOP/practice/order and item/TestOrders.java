public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price =3.45;

        Item item2 = new Item();
        item2.name = "Cappuccino";
        item2.price = 4.99;

        Item item3 = new Item();
        item3.name = "latte";
        item3.price= 3.5;

        Item item4 = new Item();
        item4.name = "drip coffee";
        item4.price= 2.5;

       

        Order order1 = new Order();
        order1.name = "Cindhuri";
       
        Order order2 = new Order();
        order2.name = "jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        System.out.println(order1.name);
        System.out.println(order1.total); //  output : 0.0

        //Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;
     

        //Noah ordered a cappuccino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item2);
        order3.total += item2.price;
        

        // Sam added a latte. Update the order accordingly.
        order4.items.add(item3);
        order4.total += item3.price;
      

        //Cindhuri’s order is now ready. Update her status.
        order1.ready = true;


       

        //Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item3);
        order4.items.add(item3);
        order4.total += 2 * item3.price;

        //Jimmy’s order is now ready. Update his status.
        order2.ready = true;


        // Testing order

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
    
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);





        




}
}
