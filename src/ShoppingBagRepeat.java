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
        askUserRecursion();
        //askUserNonRecursion();
    }

    //Uses recursion to get the tally
    public static void askUserRecursion() {

        //make a scanner object to capture input
        Scanner userInput;
        userInput = new Scanner(System.in);

        //use these variables to hold the userInput from Scanner
        int numberOfItems;
        double costOfItems;

        //ask the user to put in an amount of items or finish and tally total
        System.out.println("Enter item count (or 0 to stop and tally total)");
        numberOfItems = userInput.nextInt();

        //if the user inputs anything other than 0 then the program asks for the cost and uses the place()
        if (numberOfItems != 0) {
            System.out.println("Please enter the cost of the item entered into the bag");
            costOfItems = userInput.nextDouble();
            myBag.place(numberOfItems, costOfItems);
        }
        //if the user does input 0 then toString() is called and the program exits
        else {
            System.out.println(myBag.toString());
            System.exit(0);
        }
        //method calls itself until it hits the previous else statement
        askUserRecursion();
    }

    public static void askUserNonRecursion() {

        //the ShoppingBag object for askUserNonRecursion
        ShoppingBag myBag = new ShoppingBag(6);

        //loop through a lot, if customer has 100001 items that sucks for us :(
        for(int i = 0; i < 100000; i++) {

            //Scanner object to capture userInput
            Scanner userInput;
            userInput = new Scanner(System.in);

            //use these variables to hold the userInput from Scanner
            int numberOfItems;
            double costOfItems;

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
                System.exit(0);
            }
        }
    }
}
