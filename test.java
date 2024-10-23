import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform the addition
        int sum = num1 + num2;

        // Output the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
