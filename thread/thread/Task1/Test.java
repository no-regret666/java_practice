package Task1;

import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[] args) {
        final int SIZE = 100;
        int[] array = new int[SIZE];

        for(int i = 0;i < SIZE;i++){
            array[i] = (int)(Math.random() * 100 + 1);
        }

        Sort sort = new Sort(array);
        System.out.println("排序后的数组为:");
        //System.out.println(sort.);
    }
}
