package Practice.Abstract;

import Practice.Final.Student;

public class Test {
    public static void main(String[] args) {
        //抽象类不能创建对象
        //Person p = new Person(); 会报错
        Student s = new Student("zhangsan",23);
        System.out.println(s.getName() + ", "+ s.getAge());
    }
}
