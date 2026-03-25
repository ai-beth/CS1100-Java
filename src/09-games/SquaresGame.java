import java.util.Scanner;

public class SquaresGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 6) {
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            if (num == 99) {
                break;
            }
            if (num % 2 == 0) {
                System.out.println("Square is " + num * num);
            }
            count++;
        }
        System.out.println("ALL DONE!");
    }
}
