package SchoolWork1;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double distance = Distance(x,y);
        if(distance <= 10){
            System.out.println("Point(" + x + "," + y + ")is in the circle");
        }
        else {
            System.out.println("Point(" + x + "," + y + ")is not in the circle");
        }
    }
    public static double Distance(double x,double y){
        double temp = Math.pow(x,2) + Math.pow(y,2);
        return Math.sqrt(temp);
    }
}
