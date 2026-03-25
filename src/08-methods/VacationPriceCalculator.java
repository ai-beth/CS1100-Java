//VacationPriceCalculator.java
//Create a vacation planner utilizing three methods defined in our instructions


///public static double calculateRoomCost(int nights)
//This method will display the room types and price per room. This method will read the choice
//for a room and return the total cost for that room for the number of nights. Your main will add
//this total amount for room for this guest to the running total.

//public static double calculateMealPlan(int nights)
//This method will prompt the user for the type of daily meal plan and return an amount for meals
//for that guest during the stay. Your main will add this amount to the running total.

//public static double getActivitiesCost()
//This method will prompt for activities for one member of the group. The method loops,
//displaying the list of activities and allows the user to select an activity. A subtotal is kept in this
//method since the user may choose more than one activity. The loop stops when the user selects
//Done Selecting Activities and then method returns a total for this guest’s activities.
//After all members of the group have been taken care of, the program will display the total cost for
//staying at the resort.

// Finally, Write a method that will display the average daily cost for the trip per person. You get to
//design the method signature and have the main call your method.
// Average daily cost = trip total/ (days * num guests)

//import scanner for input
import java.util.Scanner;

//create the class
public class VacationPriceCalculator {

    //create the main
    public static void main(String[] args) {

        //display the header
        System.out.println("Welcome to Likuliku Lagoon Resort - Malolo Island, Fiji.");

        //scanner for input
        Scanner scanner = new Scanner(System.in);

        //prompt the user for the number of guests
        System.out.print("Please enter the number of guests: ");
        int numGuests = scanner.nextInt();

        //prompt the user for the number of nights
        System.out.print("How many nights will you be staying? ");
        int numNights = scanner.nextInt();

        //calculate the totalCost
        //create the variable to keep track of the total cost and call the methods we created to find the total
        //depending on the RoomCost,MealPlan,Activities chosen for the numGuests and numNights
        double totalCost = 0;
        for (int guest = 1; guest <= numGuests; guest++) {
            System.out.println("\nStart entering details for guest #" + guest);
            totalCost += calculateRoomCost(numNights);
            totalCost += calculateMealPlan(numNights);
            totalCost += getActivitiesCost();
        }
        //display the totalCost
        System.out.println("\n-------------------------------------------------------------------");
        System.out.printf("The total cost estimate $%.2f%n", totalCost);

        //calculate and display the average nightly cost per person
        double averageNightlyCost = calculateAverageNightlyCost(totalCost, numNights, numGuests);
        System.out.printf("Average nightly cost per person: $%.2f%n", averageNightlyCost);
    }


    //the method to calculate the room cost
    public static double calculateRoomCost(int nights) {
        //display the options
        System.out.println("1 : Standard Room no view $100/night");
        System.out.println("2 : Luxury Room with view $200/night");
        System.out.println("3 : Luxury Room with Balcony $300/night");

        //prompt the user for their choice and create the choice variable to store that amount
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();

        //switch statement to correctly select the room amount depending on the users input choice number
        double roomPrice = switch (choice) {
            case 1 -> 100;
            case 2 -> 200;
            case 3 -> 300;
            default -> 0;
        };

        //return the total room price times the numNights so the user gets and accurate room total
        // when they call this method
        return roomPrice * nights;
    }

    //method to calculate the meal plan pricing
    public static double calculateMealPlan(int nights) {

        //display the choices
        System.out.println("1 : Lunch & Dinner only $65");
        System.out.println("2 : 3-Meals a day $150");
        System.out.println("3 : 3-Meals a day with drinks $225");
        System.out.println("4 : No meal plan $0");

        //prompt the user to select their choice
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();

        //use a switch statement to select the correct choice depending on the user selection
        double mealPrice = switch (choice) {
            case 1 -> 65;
            case 2 -> 150;
            case 3 -> 225;
            default -> 0;
        };

        //return the price for the user selected meal plan times the number of nights they are staying
        return mealPrice * nights;
    }


    //method to calculate the activity costs depending on user input
    public static double getActivitiesCost() {
        double subtotal = 0;
        Scanner scanner = new Scanner(System.in);

        //while statement with a sentinel value of 6 that prompts the user for activity selections
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
            //switch statement with each of the activity costs associated with their choice number
            double activityCost = switch (choice) {
                case 1 -> 300;
                case 2 -> 100;
                case 3 -> 125;
                case 4 -> 500;
                default -> 0;
            };
            subtotal += activityCost;
        }
        //return the subtotal
        return subtotal;
    }

    //method to calculate the average nightly cost per person
    public static double calculateAverageNightlyCost(double totalCost, int numNights, int numGuests) {
        return totalCost / (numNights * numGuests);
    }
}
