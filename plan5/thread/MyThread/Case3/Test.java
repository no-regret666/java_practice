package MyThread.Case3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();

        //作用管理多线程运行的结果
        FutureTask<Integer> ft = new FutureTask<>(mc);

        Thread t1 = new Thread(ft);

        t1.start();

        Integer result = ft.get();
        System.out.println(result);
    }
}