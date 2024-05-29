package reflect;

import domain.Person;

import java.lang.reflect.Constructor;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        //Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor construtor = personClass.getConstructor(String.class,int.class);
        System.out.println(construtor);

        //创建对象
        Object person = construtor.newInstance("张三",23);
        System.out.println(person);

        Constructor construtor1 = personClass.getConstructor();
        System.out.println(construtor);

        //创建对象
        Object person1 = construtor1.newInstance();
        System.out.println(person1);

        //空参构造的简化形式
        Object o = personClass.newInstance();
        System.out.println(o);
    }
}
