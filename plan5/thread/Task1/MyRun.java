package Task1;

import java.util.Arrays;

public class MyRun implements Runnable{
    private final int[] array;

    public MyRun(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        Arrays.sort(array);
    }
}
