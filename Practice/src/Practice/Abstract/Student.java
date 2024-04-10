package Practice.Abstract;

//抽象类的子类：要么重写抽象类中的所有抽象方法 ，要么是抽象类
public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
