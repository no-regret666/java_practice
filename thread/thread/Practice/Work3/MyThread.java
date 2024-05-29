package Practice.Work3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    static Lock lock = new ReentrantLock();

    static int num = 1;

    @Override
    public void run() {
        while(true){
            try {
                lock.lock();
                if(num % 2 != 0){
                    System.out.println(getName() + ":" + num);
                }
                if(num == 100){
                    break;
                }
                num++;
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
