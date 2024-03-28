package Practice.Subject;

public class BoyFriend {
    //属性,成员变量
    private String name; //默认值为null
    private int age; //默认为0
    private String gender;
    //private:权限修饰符
    //被private修饰的成员只能在本类中才被访问,保证数据的安全性
    //针对每一个私有化的成员变量，都要提供get和set方法，用public修饰
    //set:给成员变量赋值
    //get:对外提供成员变量的值

    /**
     * 构造方法：创建对象的时候，由虚拟机自动调用，给成员变量初始化
     * 1.方法名与类名一致
     * 2.没有返回值类型，连void都没有
     * 3.没有具体的返回值（不能由return带回结果数据）
     * 如果我们没有写任何的构造方法，虚拟机将给我们加一个空参构造方法
     * 无参构造方法：初始化对象时，成员变量的数据采用默认值
     * 有参构造方法：初始化对象时可以同时为对象进行赋值
     * 一旦定义了有参数构造器，无参数构造器就没有了，需要自己写
     */
    public BoyFriend(){
        //无参数构造器
    }
    public BoyFriend(String n,int age){
        name = n;
        this.age = age;
    }

    public void method(){
        int age = 10; //局部变量
        System.out.println(age); //就近原则
        System.out.println(this.age); //this:区别成员变量和局部变量
        //this：代表方法调用者的地址值
    }

    //public:公共的
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        if(a >= 18 && a <= 50){
            age = a;
        }
        else {
            System.out.println("年龄超出范围");
        }
    }

    public int getAge(){
        return age;
    }

    public void setGender(String g){
        gender = g;
    }

    public String getGender(){
        return gender;
    }

}
