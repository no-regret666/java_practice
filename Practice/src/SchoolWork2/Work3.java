package SchoolWork2;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double bool;
        bool = Math.sqrt(b * b - 4 * a * c);
        double r1,r2;
        r1 = (- b + bool) / 2 * a;
        r2 = (- b - bool) / 2 * a;
        if(Math.abs(bool) < 1e-6)
            System.out.printf("The root is:%.2f",r1);
        else if(bool > 1e-6)
            System.out.println("The root are " + r1 + " and " + r2);
        else
            System.out.println("The equation has no real roots");
    }
}
