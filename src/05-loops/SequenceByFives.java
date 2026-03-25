//SequenceByFives.java
//Use a for loop to display 3,8,13,18,23,28



public class SequenceByFives {
    public static void main(String[] args) {
        //initialize the starting value
        int start = 3;

        //define the step size
        int step = 5;

        // Loop to generate and print the sequence
        for (int i = 0; i < 6; i++) { //Had a hard time here, why cant it be i<=28? is it because these are iterations?
            System.out.print(start + i * step + " ");
        }

    }
}
