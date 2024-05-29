package reflect;

import domain.Person;

public class Demo1 {
    //获取class的三种方式
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")
        Class cls = Class.forName("domain.Person");
        System.out.println(cls);

        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3.对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //==比较三个对象
        System.out.println(cls == cls2);
        System.out.println(cls2 == cls3);
    }
}
