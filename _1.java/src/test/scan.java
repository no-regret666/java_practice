package test;//1.导包,找到Scanner这个类在哪儿，书写在类定义的上面
import java.util.Scanner;

public class scan {
    public static void main(String[] args){
        //2.创建对象，表示我现在要用Scanner这个类
        Scanner sc = new Scanner(System.in);

        //3.接受数据
        System.out.println("请输入整数：");
        int i = sc.nextInt();
        System.out.println(i);
    }
}
