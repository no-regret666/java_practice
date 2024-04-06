package Case1;

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");

        //开启线程
        t1.start();
        t2.start();

//        Thread t = Thread.currentThread();
//        System.out.println(t.getName()); //main
        //当JVM虚拟机启动之后，会自动地启动多条线程，其中有一条线程就叫做main线程
        //他的作用就是去调用main方法，并执行里面的代码，在以前，我们写的所有的代码，其实都是运行在main线程中
    }
}
