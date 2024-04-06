package SchoolWork1;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        int q,m,j,k;
        System.out.print("Enter year(e.g. 2012):");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        k = year % 100;
        j = year / 100;
        System.out.print("Enter month(1-12):");
        m = sc.nextInt();
        if(m == 1){
            m = 13;
        }
        else if(m == 2){
            m = 14;
        }
        System.out.print("Enter the day of the month(1-31):");
        q = sc.nextInt();
        year--;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        if(h == 0) {
            System.out.println("Day of the week is 星期六");
        }
        else if(h == 1){
            System.out.println("Day of the week is 星期天");
        }
        else if (h == 2) {
            System.out.println("Day of the week is 星期一");
        }
        else if(h == 3){
            System.out.println("Day of the week is 星期二");
        }
        else if(h == 4){
            System.out.println("Day of the week is 星期三");
        }
        else if(h == 5){
            System.out.println("Day of the week is 星期四");
        }
        else if(h == 6){
            System.out.println("Day of the week is 星期五");
        }
    }
}
