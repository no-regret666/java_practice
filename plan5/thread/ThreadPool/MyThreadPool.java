package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool{
    public static void main(String[] args) throws InterruptedException {
        //public static ExecutorService newCachedThreadPool()   创建一个没有上限的线程池
        //public static ExecutorService newFixedThreadPool(int nThreads)     创建有上限的线程池

        //1.获取线程池对象
        ExecutorService pool1 = Executors.newCachedThreadPool();

        //2.提交任务
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);

        pool1.submit(new MyRunnable());

        //3.销毁线程池
        pool1.shutdown();
    }
}
