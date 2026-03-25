//IsTriangle.java
//Write a program to take 3 sides of a triangle as input and determine the perimeter and if
//they form a valid triangle

//import scanner for input
import java.util.Scanner;

//create the class
public class IsTriangle {

    //create the main
    public static void main(String[] args) {

        //new scanner
        Scanner scanner = new Scanner(System.in);

        //prompt the user for side input
        System.out.print("Please enter 3 sides of a triangle (separated by spaces): ");
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        //evaluate if the sides form a valid triangle and display the perimeter
        if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideC + sideA > sideB)) {
            int perimeter = sideA + sideB + sideC;
            System.out.println("The perimeter of the triangle is " + perimeter);
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
}