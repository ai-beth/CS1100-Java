//ArrayContents.java
//Create a program that uses a for-loop to initialize an array and print the contents of the array
//The contents of the array should be the int values 2,4,6,8,10,12,14,16,18,20,22,24

public class ArrayContents {

    //main
    public static void main(String[] args) {

        //create the empty array with 12 values to use in the for loop
        int[] myList = new int[12];

        //for-loop to initialize the array elements to be the first 12 even numbers after 0
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (i + 1) * 2;//we want to start at 2 and not 0 so we have to add 1
        }

        //display the header
        System.out.println("The contents of the array:");

        //format to be left justified and have 10 spaces
        System.out.printf("%-10s %s\n", "Index", "Value");

        //for loop to display the values for the array
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("%-10d %d\n", i, myList[i]);//also left justified with 10 spaces to be visually pleasing
        }
    }
}
