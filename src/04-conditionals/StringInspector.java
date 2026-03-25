//StringInspector.java
//Write a program that prompts the user to
//enter a String and displays the first character
//and
//displays whether the string has 3 or more characters long.

import java.util.Scanner;

public class StringInspector{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String str = input.nextLine();

        //display whether str has three or more characters.  hint length()
        if(str.length() >= 3){
            System.out.println("The string is 3 or more characters long.");
        } else {
            System.out.println("The string is less than 3 characters long.");
        }

        //display the first character of str, hint charAt()
        if(str.length() > 0){
            System.out.println("The first character of the string is: " + str.charAt(0));
        } else {
            System.out.println("The string is empty.");
        }
    }
}
