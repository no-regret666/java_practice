package SchoolWork1;

import java.util.Scanner;

public class Work5 {
    public static void main(String[] args) {
        double xCircle1, yCircle1, rCircle1;
        double xCircle2, yCircle2, rCircle2;
        double distance;
        System.out.print("Enter circle1's center x-,y-coordinates,and radius: ");
        Scanner input = new Scanner(System.in);
        xCircle1 = input.nextDouble();
        yCircle1 = input.nextDouble();
        rCircle1 = input.nextDouble();
        System.out.print("Enter circle2's center x-,y-coordinates,and radius: ");
        xCircle2 = input.nextDouble();
        yCircle2 = input.nextDouble();
        rCircle2 = input.nextDouble();
        distance = Math.pow((Math.pow(xCircle1 - xCircle2, 2) + Math.pow(yCircle1 - yCircle2, 2)), 0.5);
        if (rCircle1 + rCircle2 >= distance) {
            if (rCircle1 - rCircle2 >= distance)
                System.out.println("circle2 is inside circle1");
            else
                System.out.println("circle2 overlaps circle1");
        }
        else
            System.out.println("circle2 does not overlap circle1");
        input.close();
    }
}
