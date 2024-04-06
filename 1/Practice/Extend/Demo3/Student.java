package Practice.Extend.Demo3;

public class Student extends Person{
    //子类不能继承父类的构造方法，但是可以通过super调用
    public Student() {
        super(); //先调用父类的无参构造将父类数据空间初始化
        System.out.println("子类的无参构造");
    }

    public Student(String name,int age){
        super(name,age);
    }
}
