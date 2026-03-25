//DollarCentsPrinter.java
//Create a method that tell the dollars and cents amount in a total given


import java.util.Scanner;

public class DollarCentsPrinter {
    public static void main(String[] args) {
        //create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an amount: ");
        String input = scanner.nextLine();

        //invoke the dollarCents method
        dollarCents(input);
    }

    public static void dollarCents(String s) {
        //remove the dollar sign and any other non-digit characters
        String cleanedInput = s.replaceAll("[^\\d.]", "");
        double amount = Double.parseDouble(cleanedInput);

        //extract dollars and cents
        int dollars = (int) amount;
        int cents = (int) ((amount - dollars) * 100);

        //display the result
        System.out.println("There are " + dollars + " dollars and " + cents + " cents.");
    }
}
