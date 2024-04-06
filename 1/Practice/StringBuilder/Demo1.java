package Practice.StringBuilder;

import java.lang.StringBuilder;
//import java.lang.String;

public class Demo1 {
    public static void main(String[] args) {
        //StringBuilder:一个容器，创建之后里面的内容是可变的
        //作用：提高字符串的操作效率

        StringBuilder sb = new StringBuilder("abc");

        //添加元素
//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);
        //添加字符串
        sb.append("aaa").append("bbb").append("ccc").append("ddd");

        //反转
        sb.reverse();

        //获取长度
        int len = sb.length();
        System.out.println(len);

        //把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
