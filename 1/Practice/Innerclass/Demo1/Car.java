package Practice.Innerclass.Demo1;

//外部类
public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show(){
        System.out.println(carName);
        Engine e = new Engine();
        System.out.println(e.engineName); //报错，外部类要访问内部类的成员，必须创建对象
    }

    //内部类
    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            System.out.println(carName); //内部类可以直接访问外部类的成员，包括私有
        }
    }
}
