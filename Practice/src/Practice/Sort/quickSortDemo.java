package Practice.Sort;

import java.util.Random;

public class quickSortDemo {
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt();
//        }
        quickSort(arr,0,arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[],int i,int j){
        int start = i;
        int end = j;
        if(start > end){
            return;
        }
        int standard = arr[i];
        while(start != end){
            while (start < end && arr[end] >= standard) {
                end--;
            }
            while (start < end && arr[start] <= standard) {
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        arr[i] = arr[start];
        arr[start] = standard;

        quickSort(arr,i,start - 1);
        quickSort(arr,start + 1,j);
    }
}
