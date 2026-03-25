//GetNameMethod.java
/* Write a method called getName that prompts the user to enter their first name,
   and then returns the user input. Create a test program that will call getName
   and display the results.
 */

import java.util.Scanner;

public class GetNameMethod{

    public static void main(String[] args){
        String name = getName();
        System.out.println("The name is " + name + ".");
    }//end main

    public static String getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = input.next();
        return name;
    }

}//end review_2