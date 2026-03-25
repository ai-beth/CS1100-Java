//GratuityCalculator.java
//Create a program that takes a subtotal amount and gratuity percentage and returns the total amount of gratuity
//and bill total
//gratuity = (subtotal * rate) \ 100
// total bill = subtotal + gratuity

//import Scanner for user input
import java.util.Scanner;

//create class
public class GratuityCalculator {

    //Scanner object to get user input
    static Scanner input = new Scanner(System.in);

    //create main
    public static void main(String[] args) {

        //prompt the user for subtotal and create variable for it
        System.out.println("Enter the subtotal of the bill: ");
        double subTotal = input.nextDouble();

        //prompt the user for gratuity rate and create variable for it
        System.out.println("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        //create variable for gratuity and perform calculation
        double gratuity = subTotal * gratuityRate / 100;
        //create variable for total and perform calculation
        double total = subTotal + gratuity;

        //Display the results
        System.out.println("The gratuity amount is $" + gratuity);
        System.out.println("The bill total is $" + total);

    }
}
