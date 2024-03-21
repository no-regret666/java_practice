package test;

import java.util.Scanner;
import java.lang.Math;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double a = distance(x2,x3,y3,y2);
        double b = distance(x1,x3,y1,y3);
        double c = distance(x1,x2,y1,y2);
        double A = angle(a,b,c);
        double B = angle(b,a,c);
        double C = angle(c,b,a);
        System.out.printf("%.2f %.2f %.2f",A,B,C);
    }
    public static double distance(double x1,double x2,double y1,double y2){
        double n = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        return Math.sqrt(n);
    }

    public static double angle(double a,double b,double c){
        double m = (a * a - b * b - c * c) / ((-2) * b * c);
        return Math.toDegrees(Math.acos(m));
    }
}
