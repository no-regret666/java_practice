package Practice.generics;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());
    }
    //泛型的通配符：进行类型的限定
    //? extends E：表示可以传递E或者E所有的子类类型
    //? super E：表示可以传递E或者E所有的父类类型
    public static void method(ArrayList<? extends Ye> list){

    }
}

class Ye {
}

class Fu extends Ye{
}

class Zi extends Fu{
}
