package Practice.Static;

public class Student {
    //属性：姓名，年龄，性别

    private String name;
    private int age;
    private String gender;
    public static String teacherName;
    //static:静态，
    //1.修饰成员变量：静态变量
    //特点：被该类所有对象共享
    //不属于对象，属于类
    //2.修饰成员方法：静态方法
    //

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //行为
    public void study(){
        System.out.println(name + "正在学习");
    }

    public void show(){
        System.out.println(name + "," + age + "," + gender + "," + teacherName);
    }
}
