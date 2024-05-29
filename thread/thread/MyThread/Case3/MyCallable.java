package MyThread.Case3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    //重写call（是有返回值的，表示多线程运行的结果）
    @Override
    public Integer call() throws Exception {
        //求1-100之间的和
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
