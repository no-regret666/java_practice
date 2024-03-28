package Practice.StringJoiner;

import java.util.StringJoiner;

public class Demo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner(",","[","]"); //三个参数：间隔符号，开始符号，结束符号

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length(); //所有字符个数
        System.out.println(len); //15

        //3.打印
        System.out.println(sj);

        String str = sj.toString();
        System.out.println(str);
    }
}
