//MultiplesOfFiveArray.java
/*
Write a program that declares and initializes an array of integers to the values 5,10,15,
20, 25, 30, 35, 40, 45, 50, 55. Do not use the auto-intializing format, but rather a loop.
Have your program the contents of the array after it has been initialized to the multiples
of 5.
Sample Run:
           5 10 15 20 25 30 35 40 45 50
 */

public class MultiplesOfFiveArray{
    public static void main(String[] args){
        int[] numbers = new int[11];
        for (int i = 1; i < numbers.length; i++){
           numbers[i] = i * 5;
        }

        System.out.print("The array is: ");
        for (int i = 1; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }


    }//end main
}//end Review_