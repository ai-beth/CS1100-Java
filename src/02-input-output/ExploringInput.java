//ExploringInput.java
//learning to take user input

import java.util.Scanner;

public class ExploringInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //prompt the user for the proper data
        System.out.println("Enter a radius");

        //get some data from the user
        int radius = input.nextInt();

        System.out.println("the number you typed is "+ radius);
    }


}
