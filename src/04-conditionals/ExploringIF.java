//ExploringIF.java
//Examining the use of IF statement to validate input

import java.util.Scanner;

public class ExploringIF {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int myData = 0;

        System.out.println("Enter a number:");

        myData = input.nextInt();

        if (myData > 0){
            System.out.println("The area based on input is " + (myData * myData * 3.14159));
        }
    }



}
