package Practice.Collection;

import java.util.ArrayList;
import java.util.Collection;

//增强for遍历
public class Demo2 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        for (String s : coll) {
            System.out.println(s);
        }
    }
}
