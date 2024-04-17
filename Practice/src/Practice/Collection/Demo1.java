package Practice.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//迭代器遍历
public class Demo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //获取迭代器对象
        //迭代器就好比是一个箭头，默认指向集合的0索引处
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
            //迭代器遍历时，不能用集合的方法进行添加或删除
            if("bbb".equals(str)){
                //coll.remove("bbb");
                it.remove();
            }
        }
        //上面循环结束后，迭代器的指针已经指向了最后没有元素的位置
        //迭代器遍历完毕，指针不会复位
    }
}
