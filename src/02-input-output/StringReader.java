//StringReader.java
// Write a program that:
//1. Reads in 10 strings, stores each string in an array of string.
//2. Display the contents of the array in order using a for-loop.
//3. Display the content of the array from the end of the array to the beginning of the array using a for-loop
//4. Prompts the user for a character and displays the strings in the array that start with that character.
//HINTS
//To read in a character as input takes two steps:
//String s = input.nextLine();
//char c = s.charAt(0);
//String str = array[i]
//if (str.charAt(0) == c)
// then found a MATCH!


import java.util.Scanner;

public class StringReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = new String[10];  // Array to store 10 strings

        // 1. Read in 10 strings
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter string " + (i + 1) + ":");
            strings[i] = input.nextLine();
        }

        // 2. Display the contents of the array in order
        System.out.println("\nStrings in order:");
        for (int i = 0; i < 10; i++) {
            System.out.println(strings[i]);
        }

        // 3. Display the contents of the array in reverse order
        System.out.println("\nStrings in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(strings[i]);
        }

        // 4. Prompt the user for a character and display the strings that start with that character
        System.out.println("\nEnter a character:");
        String s = input.nextLine();
        char c = s.charAt(0);

        //display the strings that begin with the user entered character
        System.out.println("\nStrings that start with '" + c + "':");

        //for-loop to iterate through the strings and check the starting character(0) to see if it matches
        //the user entered character.
        for (int i = 0; i < 10; i++) {
            if (strings[i].charAt(0) == c) {
                System.out.println(strings[i]);
            }
        }
    }
}


