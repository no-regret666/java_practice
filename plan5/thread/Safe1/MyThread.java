package Safe1;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    //表示这个类所有的对象，都共享ticket数据
    static int ticket = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //锁写在循环里面，锁对象一定要是唯一的
            //synchronized (MyThread.class){
            //同步代码块
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                }
                else {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            } //finally里的代码一定会执行
            //}
        }
    }
}
