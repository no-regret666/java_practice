package Practice.generics;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll2(list,"aaa","bbb","ccc");
        System.out.println(list);
    }
}
