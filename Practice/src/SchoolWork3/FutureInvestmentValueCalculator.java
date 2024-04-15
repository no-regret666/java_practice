package SchoolWork3;

import java.util.Scanner;

public class FutureInvestmentValueCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate (as a decimal): ");
        double annualInterestRate = input.nextDouble() / 100;
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();
        double monthlyInterestRate = annualInterestRate / 12;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        System.out.printf("Accumulated value is $ %.2f%n", futureInvestmentValue);
    }
}
