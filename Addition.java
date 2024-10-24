import java.util.Scanner;

public class Addition {

    // Method to perform addition of two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Welcome to the Addition Program!");

        // Loop to allow multiple additions
        while (continueCalculation) {
            // Input validation loop for the first number
            double num1 = 0;
            while (true) {
                System.out.print("Enter the first number: ");
                if (scanner.hasNextDouble()) {
                    num1 = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // Input validation loop for the second number
            double num2 = 0;
            while (true) {
                System.out.print("Enter the second number: ");
                if (scanner.hasNextDouble()) {
                    num2 = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // Perform the addition and display the result
            double sum = add(num1, num2);
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            // Ask if the user wants to perform another addition
            System.out.print("Would you like to perform another addition? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                continueCalculation = false;
            }
        }

        System.out.println("Thank you for using the Addition Program. Goodbye!");
        scanner.close();
    }
}
