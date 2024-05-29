package Practice.Work1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    static int ticket = 1000;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            lock.lock();
            if(ticket == 0){
                lock.unlock();
                break;
            }
            else{
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticket--;
                System.out.println(getName() + "卖出了一张票!" + " 还剩余" + ticket + "张票");
            }
            lock.unlock();
        }
    }
}
