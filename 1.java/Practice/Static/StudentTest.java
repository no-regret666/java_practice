package Practice.staticdemo;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "阿伟老师";
        //静态变量是随着类的加载而加载的，优先于对象出现的

        //1.创建第一个学生对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //s1.teacherName = "阿伟老师";

        s1.study();
        s1.show();

        //2.创建第二个学生对象
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("女");

        s2.study();
        s2.show();

        Student s3 = new Student("王五",25,"男");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //调用工具类中的方法
        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
