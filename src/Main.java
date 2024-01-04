import Models.Item;
import Models.Order;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Gorkhali_batman", 572,"Graphic text: You either die a hero or live long enough to see yourself be a villain", "karuna",12345,new String[]{"Large" ,"Medium","Small" });
        Item item2 = new Item("Gorkhali_spidey", 681, "Graphic text: You either die a hero or live long enough to see yourself be a villain","karuna",12345,new String[]{"Large" ,"Medium","Small" });
        Item item3 = new Item("Gorkhali_captain", 522,"Graphic text: You either die a hero or live long enough to see yourself be a villain","karuna",12345,new String[]{"Large" ,"Medium","Small" });
        Item item4 = new Item("Gorkhali_hawkai", 513,"Graphic text: You either die a hero or live long enough to see yourself be a villain" ,"karuna",12345,new String[]{"Large" ,"Medium","Small" });
        Item item5 = new Item("Gorkhali_ironman", 521,"Graphic text: You either die a hero or live long enough to see yourself be a villain","karuna",12345,new String[]{"Large" ,"Medium","Small" });


        Order order1 = new Order("Gopal sharma",  48675646 ,new int[]{572,681}, new int[]{1235,1780});

        item1.describe();
        item2.describe();
        order1.displayInformation();




    }






}
