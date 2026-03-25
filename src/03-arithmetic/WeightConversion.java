//WeightConversion.java
//Write a program to convert and display a table of kilograms to pounds

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Printing the header
        System.out.println("Kilograms Pounds");
        System.out.println("----------------");

        //using a for-loop to generate and print the conversion table
        for (int kg = 1; kg <= 19; kg += 2) { //kilograms from 1 to 19, incrementing by 2
            double pounds = kg * 2.2;

            //display the conversion result
            System.out.printf("%-10d %.1f\n", kg, pounds);
        }

    }
}
