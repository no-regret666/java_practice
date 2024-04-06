package Practice.Static;

import java.util.ArrayList;

public class StudentUtil {
    //构造方法私有化
    private StudentUtil(){}

    //静态方法
    public static int getMaxAgeStudent(ArrayList<Student> list){
        int max = list.get(0).getAge();

        for (int i = 1; i < list.size(); i++) {
            max = Math.max(max,list.get(i).getAge());
        }

        return max;
    }
}
