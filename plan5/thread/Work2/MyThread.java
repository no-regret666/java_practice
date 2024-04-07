package Work2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    static int gift = 100;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try {
                lock.lock();
                if(gift < 10){
                    break;
                }
                else{
                    gift--;
                    System.out.println(getName() + "送出了一份礼物!" + " 还剩" + gift + "份礼物");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
