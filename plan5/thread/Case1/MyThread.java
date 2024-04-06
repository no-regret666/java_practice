package Case1;

//有已经写好的Thread类，让自己定义的类直接继承
public class MyThread extends Thread{
    @Override
    public void run() {
        //书写线程要执行代码
        for(int i = 0;i < 5;i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + " HelloWorld");
        }
    }
}
