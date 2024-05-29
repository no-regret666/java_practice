package SchoolWork3;

import java.util.Arrays;
import java.util.Random;

public class SearchTest {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // 生成随机数组
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000000);
        }
        int key = rand.nextInt(1000000);
        long startTimeLinear = System.currentTimeMillis();
        int resultLinear = linearSearch(arr.clone(), key);
        long endTimeLinear = System.currentTimeMillis();
        System.out.println("Linear search execution time: " + (endTimeLinear - startTimeLinear) + " ms");
        Arrays.sort(arr);
        long startTimeBinary = System.currentTimeMillis();
        int resultBinary = binarySearch(arr, key);
        long endTimeBinary = System.currentTimeMillis();
        System.out.println("Binary search execution time: " + (endTimeBinary - startTimeBinary) + " ms");
        System.out.println("Linear search result: " + resultLinear);
        System.out.println("Binary search result: " + resultBinary);
    }
}