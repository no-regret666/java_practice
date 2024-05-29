package reflect;

import domain.Person;

import java.lang.reflect.Method;

public class Demo4 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat_method.invoke(p);

        Method eat_method2 = personClass.getMethod("eat", String.class);
        eat_method2.invoke(p,"饭");

        System.out.println("-------------");

        //获取所有public修饰的方法(包括父类如 Object 的方法)
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);

            //获取方法名
            String methodName = method.getName();
            System.out.println(methodName);
            //method.setAccessible(true);
        }

        //获取类名
        String className = personClass.getName();
        System.out.println(className);
    }
}
