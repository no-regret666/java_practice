package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int array1[] = new int[10000];
        int j = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if(array1[tmp] == 0){
                array1[tmp]++;
                array[j++] = tmp;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }
    }
}