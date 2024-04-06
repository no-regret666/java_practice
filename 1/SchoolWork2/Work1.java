package SchoolWork2;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        String name;
        int hour;
        double pay,money,f_rate,s_rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee’s name (e.g. Smith)");
        name = sc.next();
        System.out.println("Number of hours worked in a week (e.g. 10)");
        hour = sc.nextInt();
        System.out.println("Hourly pay rate (e.g. 9.75)");
        pay = sc.nextDouble();
        System.out.println("Federal tax withholding rate (e.g. 20%)");
        f_rate = sc.nextDouble();
        System.out.println("State tax withholding rate (e.g. 9%)");
        s_rate = sc.nextDouble();
        money = pay * hour;
        double f_pay,s_pay,total;
        f_pay = money * f_rate;
        s_pay = money * s_rate;
        total = s_pay + f_pay;
        double rest = money - total;
        System.out.println("Deductions:");
        System.out.printf("Federal Withholding: $%.2f\n",f_pay);
        System.out.printf("State Withholding: $%.2f\n",s_pay);
        System.out.printf("Total Deduction: $%.2f\n",total);
        System.out.printf("Net Pay: $%.2f",rest);
    }
}