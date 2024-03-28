package src.Subject;

public class BoyFriendTest {
    public static void main(String[] args) {
        //创建男朋友的对象
        Subject.BoyFriend bf = new Subject.BoyFriend();

        //赋值
        bf.setName("嘻嘻");
        bf.setAge(19);
        bf.setGender("男");

        //获取值
        System.out.println("My BoyFriend：");
        System.out.println(bf.getName());
        System.out.println(bf.getAge());
        System.out.println(bf.getGender());
    }
}
