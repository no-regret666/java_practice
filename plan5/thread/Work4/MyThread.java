package Work4;

import java.util.Random;

public class MyThread extends Thread{
    static int count = 3;
    static double money = 100;

    //最小的中奖金额
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class){
            if(count == 0){
                System.out.println(getName() + "没有抢到红包!");
            }
            else {
                double prize = 0;
                if(count == 1){
                    //最后一个红包，无需随机
                    prize = money;
                }
                else {
                    //第一次，第二次（随机）
                    Random r = new Random();
                    prize = r.nextDouble(MIN,money - 0.02);
                }
                money = money - prize;
                count--;
                System.out.println(getName() + "抢到了" + prize + "元");
            }
        }
    }
}
