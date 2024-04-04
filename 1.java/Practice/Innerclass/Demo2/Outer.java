package Practice.Innerclass.Demo2;

public class Outer {
    String name;

    private class Inner{

    }

    //获取成员内部类对象的方式：外部类编写方法，对外提供内部类对象
    public Inner getInstance(){
        return new Inner();
    }
}
