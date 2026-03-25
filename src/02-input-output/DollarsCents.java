//DollarsCents.java
//create a program that takes an amount like $50.60 and produces output in the amount
//i.e. There are 50 dollars and 60 cents


import java.util.Scanner;

public class DollarsCents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter an amount in dollars and cents
        System.out.println("PLease enter an amount in dollars and cents:");
        String moneyString = scanner.nextLine();

        //find the position of the dollar sign and decimal point
        int dollarSignIndex = moneyString.indexOf('$');
        int decimalPointIndex = moneyString.indexOf('.');

        //xxtract the dollars and cents using substring
        String dollars = moneyString.substring(dollarSignIndex + 1, decimalPointIndex);
        String cents = moneyString.substring(decimalPointIndex + 1);

        //display the result
        System.out.println("There are " + dollars + " dollars and " + cents + " cents.");


    }
}

