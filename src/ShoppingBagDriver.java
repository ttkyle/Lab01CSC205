/**
 * Programmer: kyle
 * Date: 1/23/13
 * Time: 1:05 PM
 * Exercise: Lab01-1.24
 */
public class ShoppingBagDriver {

    public static void main(String[] args) {

        //create a ShoppingBag object and test to see that it works correctly
        ShoppingBag myBag = new ShoppingBag(6);
        myBag.place(5, 10.50);
        myBag.place(2, 2.00);
        System.out.println(myBag.toString());
    }
}
