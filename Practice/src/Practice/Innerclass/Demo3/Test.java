package Practice.Innerclass.Demo3;

public class Test {
    public static void main(String[] args) {
        //当成员内部类被非私有修饰时，直接创建对象
        Outer.Inner oi = new Outer().new Inner();

        oi.show();
    }
}
