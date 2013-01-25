/**
 * Programmer: kyle
 * Date: 1/23/13
 * Time: 1:05 PM
 * Exercise: Lab01-1.24
 */
public class ShoppingBag {
    //The Attributes of the object
    private int numberOfItems;
    private double totalCost;
    private double taxRate;

    //One argument constructor that sets the taxRate from given input
    public ShoppingBag(double taxRate) {
        this.taxRate = taxRate;
    }

    //Places items in the ShoppingBag object created and keeps the total of items and cost
    public void place(int numItems, double costOfItem) {
        double costOfPurchase = numItems * costOfItem;
        numberOfItems += numItems;
        totalCost += costOfPurchase;
    }

    //Gets the total cost of the items in the bag with tax
    public double totalCost() {
        return ((taxRate * .01) * getTotalCost()) + getTotalCost();
    }

    //Returns the number of items in the bag
    public int getNumberOfItems() {
        return numberOfItems;
    }

    //returns the totalCost attribute without tax
    public double getTotalCost() {
        return totalCost;
    }

    //The toString that nicely formats the information for the user.
    public String toString() {
        return String.format("The bag contains %d items.  The retail cost of the items is $%.2f.\n" +
                "The total cost of the items is $%.2f", getNumberOfItems(), getTotalCost(), totalCost());
    }
}
