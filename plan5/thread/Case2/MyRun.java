package Case2;

public class MyRun implements Runnable{
    @Override
    public void run() {
        //书写要执行的代码
        for (int i = 0; i < 5; i++) {
            //获取到当前线程的对象
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "HelloWorld");
        }
    }
}
