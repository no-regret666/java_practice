package SchoolWork3;

import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        System.out.println("Length of the string: " + userInput.length());
        if (!userInput.isEmpty()) {
            char firstChar = userInput.charAt(0);
            System.out.println("First character of the string: " + firstChar);
        } else {
            System.out.println("The string is empty.");
        }
        input.close();
    }
}