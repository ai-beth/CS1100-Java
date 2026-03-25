import java.util.Scanner;

public class ResortCostCalculator {

    public static void main(String[] args) {
        System.out.println("Welcome to Likuliku Lagoon Resort - Malolo Island, Fiji.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of guests: ");
        int numGuests = scanner.nextInt();

        System.out.print("How many nights will you be staying? ");
        int numNights = scanner.nextInt();

        double totalCost = 0;
        for (int guest = 1; guest <= numGuests; guest++) {
            System.out.println("\nStart entering details for guest #" + guest);
            totalCost += calculateRoomCost(numNights);
            totalCost += calculateMealPlan(numNights);
            totalCost += getActivitiesCost();
        }

        System.out.println("\n-------------------------------------------------------------------");
        System.out.printf("The total cost estimate $%.2f%n", totalCost);

        // Calculate and print the average nightly cost per person
        double averageNightlyCost = calculateAverageNightlyCost(totalCost, numNights, numGuests);
        System.out.printf("Average nightly cost per person: $%.2f%n", averageNightlyCost);
    }

    public static double calculateRoomCost(int nights) {
        System.out.println("1 : Standard Room no view $100/night");
        System.out.println("2 : Luxury Room with view $200/night");
        System.out.println("3 : Luxury Room with Balcony $300/night");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();

        double roomPrice;
        switch (choice) {
            case 1:
                roomPrice = 100;
                break;
            case 2:
                roomPrice = 200;
                break;
            case 3:
                roomPrice = 300;
                break;
            default:
                roomPrice = 0;
                break;
        }
        return roomPrice * nights;
    }

    public static double calculateMealPlan(int nights) {
        System.out.println("1 : Lunch & Dinner only $65");
        System.out.println("2 : 3-Meals a day $150");
        System.out.println("3 : 3-Meals a day with drinks $225");
        System.out.println("4 : No meal plan $0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();

        double mealPrice;
        switch (choice) {
            case 1:
                mealPrice = 65;
                break;
            case 2:
                mealPrice = 150;
                break;
            case 3:
                mealPrice = 225;
                break;
            default:
                mealPrice = 0;
                break;
        }
        return mealPrice * nights;
    }

    public static double getActivitiesCost() {
        double subtotal = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose from these activities");
            System.out.println("1 : Scuba Adventure $300");
            System.out.println("2 : Island Shopping Hop $100");
            System.out.println("3 : Paddle Boarding $125");
            System.out.println("4 : Deep Sea Fishing $500");
            System.out.println("5 : Beach Sitting $0");
            System.out.println("6 : That's all--Done!");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 6) {
                break;
            }
            double activityCost = switch (choice) {
                case 1 -> 300;
                case 2 -> 100;
                case 3 -> 125;
                case 4 -> 500;
                default -> 0;
            };
            subtotal += activityCost;
        }
        return subtotal;
    }

    //method to calculate the average nightly cost per person
    public static double calculateAverageNightlyCost(double totalCost, int numNights, int numGuests) {
        return totalCost / (numNights * numGuests);
    }
}
