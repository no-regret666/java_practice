package SchoolWork3;

public class SelectionSortLargestLast {
    public static void sortLargestToLast(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            double temp = array[n - 1 - i];
            array[n - 1 - i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }
    public static void main(String[] args) {
        double[] numbers = {3.4, 1.7, 2.0, 8.6, 7.5, 4.1, 9.3, 6.2, 5.0, 2.8};
        System.out.println("Original array:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        sortLargestToLast(numbers);
        System.out.println("Sorted array in ascending order (largest to smallest):");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
}