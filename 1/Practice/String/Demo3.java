package Practice.String;

//字符串拼接原理
public class Demo3 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a";
        String s3 = s2 + "b" + "c";
        System.out.println(s1 == s3); //false
        //由变量参与，每一行拼接的代码，都会在内存中创建新的字符串，浪费内存

        String s4 = "a" + "b" + "c";
        System.out.println(s1 == s4); //true
        //无变量参与，都是字符串直接相加，编译之后就是拼接后的结果，会复用串池中的字符串
    }
}
