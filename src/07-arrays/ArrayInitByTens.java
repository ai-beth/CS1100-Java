//ArrayInitByTens.java
//Code Sprint 7

public class ArrayInitByTens{
    public static void main(String[] args){

        //declare an array of integers to hold 10 integers
        int[] myArray = new int[10];

        //initialize the contents of the array to
        //0 10 20 30 40 50 60 70 80 90
        //by using a for loop.
        for (int i = 0; i < myArray.length; i++){

            //multiply by 10 to count by 10s
            myArray[i] = i * 10;
        }

        //Display the contents of the array at indexes 0,2,4,6,8
        //You can use a loop or not to solve this part.

        //increment by 2 to get even elements
        for (int i = 0; i < myArray.length; i+=2){
            //display the results
            System.out.println(myArray[i]);
        }

    }//end main
}//end CodeSprint7_9AM