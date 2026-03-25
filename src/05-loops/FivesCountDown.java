//FivesCountDown.java
//Write a program that counts down from 5. 100-55

public class FivesCountDown {
    public static void main(String[] args) {
        // Using a for-loop to display values from 100 to 55, counting down by 5
        for (int i = 100; i >= 55; i -= 5) {
            System.out.print(i + " ");
        }
    }
}