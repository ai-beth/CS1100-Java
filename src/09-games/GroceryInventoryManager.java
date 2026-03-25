//GroceryInventoryManager.java
//Create an inventory program for a grocery store
//Inventory manager

//import scanner for input
import java.util.Scanner;

//Create the class
public class GroceryInventoryManager {

    //scanner to allow input from the user
    static Scanner input = new Scanner(System.in);

    //create the main function
    public static void main(String[] args) {


        //declare the arrays....

        //String[] items
        String[] items = createListOfItems();
        System.out.println();//blank line to make it more visually appealing
        //double[] prices
        double[] prices = createListOfPrices(items);
        System.out.println();//blank line to make it more visually appealing
        //int[] quantity
        int[] quantity = getQuantities(items);
        System.out.println();//blank line to make it more visually appealing

        //display all items, quantity, and price
        displayListandCost(items, prices, quantity);
        System.out.println();//blank line to make it more visually appealing

        //prompt user and read string for an item to display and
        //invoke findItem.
        System.out.print("Enter an item to display: ");
        String itemToFind = input.next();
        findItem(items, prices, quantity, itemToFind);
        System.out.println();//blank line to make it more visually appealing

        //calculate and display total cost of all inventory
        double totalCost = inventoryCost(prices, quantity);
        System.out.printf("Total investment in inventory: %.2f\n", totalCost);
        System.out.println();//blank line to make it more visually appealing

        //Display the low inventory
        displayLowInventory(items, quantity);
        System.out.println();//blank line to make it more visually appealing

        //Extra credit - prompt user for an item and amount to reduce inventory
        //call reduceInventory and then call displayListandCost
        System.out.print("Enter an item to reduce inventory: ");
        String itemToReduce = input.next();
        System.out.print("Enter the amount to reduce: ");
        int reduceAmount = input.nextInt();

        //call reduceInventory
        reduceInventory(items, itemToReduce, reduceAmount, quantity);
        System.out.println();//blank line to make it more visually appealing
        //display final inventory list
        displayListandCost(items, prices, quantity);

    }//end main


    //public static String[] createListOfItems(){
    //returns an array of String populated
    //with 5 items needed from the groceryStore
    public static String[] createListOfItems() {
        String[] list = new String[5];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter grocery item: ");
            list[i] = input.nextLine();
        }
        return list;
    }//end createListOfItems


    //public static double[] createListOfPrices(String[] list){
    //displays each item of the list and then prompts and reads
    //the price of the item.
    public static double[] createListOfPrices(String[] list) {
        double[] price = new double[5];
        for (int i = 0; i < price.length; i++) {
            System.out.print("Enter the price for " + list[i] + ":");
            price[i] = input.nextDouble();
        }
        return price;
    }//end createListOfPrices


    //public static int[] getQuantities(String[] list){
    //displays each item in list and ask user to enter the current quantity
    //on hand and stores the value in an array of int
    public static int[] getQuantities(String[] list) {
        int[] quantities = new int[5];
        for (int i = 0; i < quantities.length; i++) {
            System.out.printf("Enter current inventory for " + list[i] + ":");
            quantities[i] = input.nextInt();
        }
        return quantities;
    }//end getQuantities


    public static void displayListandCost(String[] list, double[] price, int[] quantities) {
        //displays the inventory by printing
        //an element from the three arrays on a single line
        //quantity item cost

        //display the header
        System.out.println("Quantity  Item     Cost");

        for (int i = 0; i < list.length; i++) {
            System.out.printf("%-9d %-8s %.2f\n", quantities[i], list[i], price[i]);
        }
    }//end displayListandCost


    public static void findItem(String[] list, double[] price, int[] quantity, String item) {
        //searches list for item
        //if item is found in the list, will display  item quantity, and price
        //if item is not in the list, display an appropriate message to the user
        boolean found = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(item)) {
                System.out.printf("Item: %s Qty: %d Cost: %.2f\n", list[i], quantity[i], price[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found");
        }
    }//end findItem


    //public static double inventoryCost(double[] prices, int[] qty){
    //sums the quantity * price for each item and returns this value
    public static double inventoryCost(double[] prices, int[] qty) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += qty[i] * prices[i];
        }
        return total;
    }//end inventoryCost


    public static void displayLowInventory(String[] list, int[] qty) {
        System.out.print("Items that are low in stock:");
        for (int i = 0; i < list.length; i++) {
            if (qty[i] < 3) {
                System.out.print(list[i] + " ");
            }
        }
        System.out.println();
    }

    //extra credit
    public static void reduceInventory(String[] list, String item, int amount, int[] qty) {
        //finds item in list and reduces qty by amount
        boolean itemFound = false; //flag to track if item is found
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(item)) {
                itemFound = true; //item is found
                if (qty[i] >= amount) {
                    qty[i] -= amount;
                    System.out.printf("Reduced %s by %d units.\n", item, amount);
                    return; //exit the method after reducing inventory
                } else {
                    System.out.println("Insufficient quantity for " + item + ".");
                    return; //exit the method, since we've addressed the issue
                }
            }
        }
        if (!itemFound) {
            System.out.println("Item not found.");//error message if item not found
        }
    }
}



