//SphereVolumeArea.java
//Create a Java program that will calculate the volume and area of a sphere

//import the scanner so we can get user input
import java.util.Scanner;

public class SphereVolumeArea {
    public static void main(String[] args) {

        //declare PI a constant
        final double PI = 3.14159;

        //scanner for input
        Scanner input = new Scanner(System.in);

        //prompt the user for the radius data and create variable
        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();


        //compute the area and volume
        double area = 4 * (radius * radius * PI);
        double volume = (4.0 / 3) * (radius * radius * radius) * PI;

        //display the results
        System.out.println("Area is " + area);
        System.out.println("Volume is " + volume);
    }


}