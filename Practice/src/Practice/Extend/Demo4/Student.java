package Practice.Extend.Demo4;

public class Student {
    String name;
    int age;
    String school;

    //需求：默认学校为传智大学
    public Student(){
        //this(...) 调用本类其他构造方法
        this(null,0,"传智大学");
    }
    public Student(String name,int age,String school){
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
