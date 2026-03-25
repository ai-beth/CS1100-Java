//AreaPerimeter.java
//Write a program that prompts and reads user input for the width and height of a rectangle. Your program
//will calculate and display the area and perimeter of the rectangle.

//import the scanner so we can get user input
import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {

        //scanner for input
        Scanner input = new Scanner(System.in);

        //prompt the user for the width data and create variable
        System.out.println("Please enter the width: ");
        double width = input.nextDouble();

        //prompt the user for the height data and create variable
        System.out.println("Please enter the height: ");
        double height = input.nextDouble();

        //compute the area and perimeter using the input data
        double area = width * height;
        double perimeter = (width * 2) + ( height * 2);

        //display the results
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }


}