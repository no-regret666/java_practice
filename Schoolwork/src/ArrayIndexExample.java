import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexExample {
    public static void main(String[] args) {
        // Create an array with 100 randomly chosen integers
        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        // Prompt the user to enter the index of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        int index;

        try {
            // Read the index from the user
            index = scanner.nextInt();

            // Display the corresponding element value
            System.out.println("The element at index " + index + " is " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("Out of Bounds");
        } catch (InputMismatchException e) {
            // Handle the InputMismatchException
            System.out.println("Invalid input, please enter an integer.");
        } finally {
            // Close the Scanner
            scanner.close();
        }
    }
}