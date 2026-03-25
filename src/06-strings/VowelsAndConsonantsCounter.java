//VowelsAndConsonantsCounter.java
//Take a user input string and count the vowels and consonants

import java.util.Scanner;

public class VowelsAndConsonantsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter a string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelsCount = 0;
        int consonantsCount = 0;
        int index = 0; //this will be used to iterate through each character of the string

        //convert the entire string to uppercase to make it easier to compare
        inputString = inputString.toUpperCase();

        //while loop to count vowels and consonants
        while (index < inputString.length()) {
            char ch = inputString.charAt(index); //get the character at the current position

            //check if the character is a letter
            if (Character.isLetter(ch)) {
                //check if the character is a vowel
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }

            index++; //move to the next character
        }

        //display the results
        System.out.println("The number of vowels is " + vowelsCount);
        System.out.println("The number of consonants is " + consonantsCount);
    }
}
