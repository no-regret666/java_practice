package Practice.Abstract;

//抽象类
//抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
public abstract class Person {
    private String name;
    private int age;

    //可以有构造方法
    //作用：当创建子类对象时，给属性进行赋值的
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //抽象方法
    //在父类中不能确定具体的方法体，该方法就可以定义为抽象方法
    public abstract void work();

    public void sleep(){
        System.out.println("睡觉");
    }
}
