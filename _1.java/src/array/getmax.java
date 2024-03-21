package array;
import java.util.Scanner;
import java.lang.Math;

public class getmax {
    public static void main(String[] args) {
        int[] arr = new int[5]; //动态初始化：只明确元素个数，不明确具体数值
        //int[] arr = {1,2,3,4,5}; //静态初始化：手动指定元素个数，系统会根据元素个数计算数组长度
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            max = Math.max(arr[i], max);
        }
        System.out.print("数组的最大值为：" + max);
    }
}
