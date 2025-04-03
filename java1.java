import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user for second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);
         // Calculate the product
        double product = num1 * num2;

        // Display the result
        System.out.println("The product is: " + product);

        // Close the scanner
        scanner.close();
    }
}

