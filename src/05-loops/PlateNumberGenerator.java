//PlateNumberGenerator.java
//Create a program that generates a random license place number.


///create the class
public class PlateNumberGenerator {

    //create the main
    public static void main(String[] args) {

        //start with an empty string for the plate number
        String plateNumber = "";

        //generate first uppercase letter
        int firstLetter = (int)(Math.random() * (90 - 65 + 1)) + 65;
        //convert the integer to a char and add to the plate number
        plateNumber += (char)firstLetter;

        //generate second uppercase letter
        int secondLetter = (int)(Math.random() * (90 - 65 + 1)) + 65;
        //convert the int to a char and add to the plate number
        plateNumber += (char)secondLetter;

        //generate third uppercase letter
        int thirdLetter = (int)(Math.random() * (90 - 65 + 1)) + 65;
        //convert the int to a char and add to the plate number
        plateNumber += (char)thirdLetter;

        //generate first digit
        int firstDigit = (int)(Math.random() * (9 - 0 + 1)) ;
        //add the digit to the plate number
        plateNumber += firstDigit;

        //generate second digit
        int secondDigit = (int)(Math.random() * (9 - 0 + 1)) ;
        //add the digit to the plate number
        plateNumber += secondDigit;

        //generate third digit
        int thirdDigit = (int)(Math.random() * (9 - 0 + 1)) ;
        //add the digit to the plate number
        plateNumber += thirdDigit;

        //generate fourth digit
        int fourthDigit = (int)(Math.random() * (9 - 0 + 1)) ;
        //add the digit to the plate number
        plateNumber += fourthDigit;

        //display the results
        System.out.println("Generated vehicle plate number: " + plateNumber);
    }
}
