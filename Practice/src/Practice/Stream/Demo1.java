package Practice.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        //filter 过滤
        //1.中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        //2.修改Stream流中的数据，不会影响原来集合或者数组中的数据

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");
        //把张开头的留下，其他数据过滤不要
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                //如果返回值为true,表示当前数据留下
//                //如果返回值为false，表示当前数据舍弃不要
//                return s.startsWith("张");
//            }
//        }).forEach(s->System.out.println(s));

        list.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(s->System.out.println(s));
        System.out.println("=================");

        //limit  获取前几个元素
        list.stream().limit(3).forEach(s->System.out.println(s));
        System.out.println("=================");

        //skip   跳过前几个元素
        list.stream().skip(4).forEach(s->System.out.println(s));
        System.out.println("=================");

        //distinct 元素去重，依赖（hashCode和equals方法）
        list.add("张无忌");
        list.stream().distinct().forEach(s->System.out.println(s));

        //concat 合并a和b两个流为一个流
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        Stream.concat(list1.stream(),list2.stream()).forEach(s->System.out.println(s));

        //map 类型转换
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"张无忌-15","周芷若-14","周敏-13");
        //需求：只获取里面的年龄进行打印
        //String->int

        //第一个类型：流中原本的数据类型
        //第二个类型：要转成之后的类型
        //apply的形参s：依次表示流里面的每一个数据
        //返回值：表示转换后的数据
        //当map方法执行完毕之后，流上的数据就变成了整数
        //所以在下面forEach当中，s依次表示流里面的每一个数据，这个数据现在就是整数了
        list3.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s->System.out.println(s));
        System.out.println("----------------------");

        list3.stream()
                .map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(s->System.out.println(s));

        //void forEach(Consumer action)    遍历
        //long count()   统计
        //toArray()    收集流中的数据，放到数组中
        String[] arr = list.toArray(new String[list3.size()]);
        System.out.println(Arrays.toString(arr));
    }
}