package Case2;

public class Test {
    public static void main(String[] args) {
        //创建MyRun的对象
        //表示多线程要执行的任务
        MyRun mr = new MyRun();

        //创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        //给线程设置名字
        t1.setName("线程1");
        t2.setName("线程2");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        //开启线程
        t1.start();
        t2.start();
    }
}
