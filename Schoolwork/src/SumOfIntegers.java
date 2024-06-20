import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter the first integer: ");

        while (true) {
            try {
                num1 = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer.");
                scanner.nextLine();
            }
        }

        System.out.print("Enter the second integer: ");

        while (true) {
            try {
                num2 = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        // Calculate and display the sum
        sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");

        scanner.close();
    }
}