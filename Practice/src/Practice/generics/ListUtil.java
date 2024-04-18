package Practice.generics;

import java.util.ArrayList;

//工具类
public class ListUtil {
    private ListUtil(){

    }

    public static<E> void addAll(ArrayList<E> list,E e1,E e2,E e3,E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }

    //E...e :可变参数
    public static<E> void addAll2(ArrayList<E> list,E...e){
        for (E element : e) {
            list.add(element);
        }
    }
}
