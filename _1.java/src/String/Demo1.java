package src.String;

import java.lang.String;
public class Demo1 {
    public static void main(String[] args) {
        //1.直接赋值
        String s1 = "abc";
        System.out.println(s1);

        //2.使用new的方式来获取一个字符串对象
        //空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println(s2);

        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //需求：修改字符串的内容     abc->Abc
        char[] chs = {'a','b','c'};
        String s4 = new String(chs);
        System.out.println(s4);

        //传递一个字节数组，根据字节数组的内容再创建一个字符串对象
        //应用场景：将字节信息转换成字符串
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5); //abcd,ASCLL码转换成字母
    }
}
