//BMICalculator.java
//Create a program to compute the users BMI using their weight in pounds and height in inches
//use math.pow

//import scanner so we can take user input
import java.util.Scanner;

//create the class
public class BMICalculator {

    //create scanner object for user input
    static Scanner input = new Scanner(System.in);

    //create main function
    public static void main(String[] args) {

        //prompt the user for the weight in pounds and create variable
        System.out.println("Enter your weight in pounds:");
        double weightInPounds = input.nextDouble();

        //prompt the user for the height in inches and create variable
        System.out.println("Enter your height in inches:");
        double heightInInches = input.nextDouble();

        //create variable for weight in kilograms and perform conversion
        double weightInKg = weightInPounds * 0.45359237;

        //create variable for height in meters and perform conversion
        double heightInMeters = heightInInches * 0.0254;

        //create bmi variable and perform conversion
        double bmi = weightInKg / Math.pow(heightInMeters,2);

        //display the results
        System.out.println("BMI is " + bmi);

    }
}
