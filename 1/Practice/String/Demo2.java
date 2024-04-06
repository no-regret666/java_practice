package Practice.String;

import java.util.Scanner;

//字符串比较
public class Demo2 {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1 = "abc"; //串池里的
        String s2 = new String("Abc"); //new出来的，就是在堆里面开辟的空间

        //2.==号比较
        //基本数据类型：比的是数据值
        //引用数据类型：比的是地址值
        System.out.println(s1 == s2);

        //3.比较字符串对象中的内容
        boolean result1 = s1.equals(s2);
        System.out.println(result1);

        //4.比较字符串对象中的内容，忽略大小写
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);

        //键盘录入与串池的比较
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next(); //new出来的

        String str2 = "abc";

        System.out.println(str1 == str2);

        //结论：只要比较字符串的内容，就必须要用String里的方法
    }
}
