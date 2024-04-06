package Safe1;

public class MyThread extends Thread{
    //表示这个类所有的对象，都共享ticket数据
    static int ticket = 0;

    @Override
    public void run() {
        while(true){
            //锁写在循环里面，锁对象一定要是唯一的
            synchronized (MyThread.class){
                //同步代码块
                if(ticket < 100){
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                }
                else{
                    break;
                }
            }
        }
    }
}
