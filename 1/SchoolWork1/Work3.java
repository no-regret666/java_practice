package SchoolWork1;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, x3, x4, y1, y2, y3, y4, k1, k2, b1, b2, x, y;
        System.out.printf("Enter x1, x2, x3, x4, y1, y2, y3, y4:");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();
        x4 = sc.nextDouble();
        y4 = sc.nextDouble();
        if (x1 != x2 && x3 != x4) {
            k1 = (y1 - y2) / (x1 - x2);
            k2 = (y3 - y4) / (x3 - x4);
            b1 = y1 - (k1 * x1);
            b2 = y3 - (k2 * x3);
            if (k1 == k2) {
                System.out.println("The two lines are paralle");
            }
            if (k1 != k2) {
                x = (b2 - b1) / (k1 - k2);
                y = (k1 * x) + b1;
                System.out.print("The intersecting point is at");
                System.out.printf("(%.4f,%.4f)", x, y);
            }
        }
        if (x1 == x2 || x3 == x4) {
            System.out.println("The two lines are paralle");
        }
        if (x1 == x2 && x3 != x4) {
            k2 = (y3 - y4) / (x3 - x4);
            b2 = y3 - (k2 * x3);
            y1 = k2 * x1 + b2;
            System.out.print("The intersecting point is at");
            System.out.printf("(%.4f,%.4f)", x1, y1);
        }
        if (x1 != x2 && x3 == x4) {
            k1 = (y1 - y2) / (x1 - x2);
            b1 = y1 - (k1 * x1);
            y3 = k1 * x3 + b1;
            System.out.print("The intersecting point is at");
            System.out.printf("(%.4f,%.4f)", x3, y3);
        }
    }
}

