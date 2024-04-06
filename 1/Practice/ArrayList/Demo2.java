package Practice.ArrayList;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<String> list = new ArrayList<String>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");


        //3.删除元素（内容/下标）
        /* boolean result1 = list.remove("aaa");
        System.out.println(result1);

        boolean result2 = list.remove("ddd");
        System.out.println(result2);

        String str = list.remove(0);
        System.out.println(str); */

        //4.修改元素
        String result = list.set(1,"ddd");
        System.out.println(result);

        //5.查询元素
        String s = list.get(0);
        System.out.println(s);
        
        //遍历
        for (int i = 0; i < list.size(); i++) {
            //i 索引
            //list.get(i) 元素
            String str = list.get(i);
            System.out.println(str);
        }

        System.out.println(list);
    }
}
