package Practice.Work2;

import Practice.Work2.MyThread;

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("小王");
        t2.setName("小李");

        t1.start();
        t2.start();

    }
}
