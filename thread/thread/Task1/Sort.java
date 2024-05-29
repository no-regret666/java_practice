package Task1;

import java.util.Arrays;

public class Sort {
    private final int SIZE = 100000;
    private final int TC = 10; //子线程个数
    private int[] array;
    private int[][] subArray;
    private int[] sortedArray;

    int cnt = SIZE / TC;

    public Sort(int[] array) {
        this.array = array;
    }

    public void init(){
        subArray = new int[TC][];
        for (int i = 0; i < TC; i++) {
            subArray[i] = new int[cnt];
            subArray[i] = Arrays.copyOfRange(array,i * cnt,(i + 1) * cnt);
        }
    }

    public void merge(){

    }

    public void printSortedArray(){

    }
}
