import java.util.Scanner;

/**
 * Programmer: kyle
 * Date: 1/23/13
 * Time: 1:40 PM
 * Exercise: Lab01-1.24
 */
public class ShoppingBagRepeat {

    //ShoppingBag object for askUserRecursion()
    static ShoppingBag myBag = new ShoppingBag(6);

    //Either method can be run I just commented one out
    public static void main(String[] args) {
        askUser();
    }

    public static void askUser() {


        boolean cont = true;

        //use these variables to hold the userInput from Scanner
        int numberOfItems;
        double costOfItems;

        //Scanner object to capture userInput
        Scanner userInput;
        userInput = new Scanner(System.in);

        //loop until the user gets us to stop
        while(cont) {

            //ask the user to input number of items in purchase
            System.out.println("Enter item count (or 0 to stop and tally total)");
            numberOfItems = userInput.nextInt();

            //if user input anything other than 0 then the program asks for cost and calls place()
            if (numberOfItems != 0) {
                System.out.println("Please enter the cost of the item entered into the bag");
                costOfItems = userInput.nextDouble();
                myBag.place(numberOfItems, costOfItems);
            }
            //if 0 is input for numberOfItems then the program prints the totals via toString and exits
            else {
                System.out.println(myBag.toString());
                cont = false;
            }
        }
    }
}
