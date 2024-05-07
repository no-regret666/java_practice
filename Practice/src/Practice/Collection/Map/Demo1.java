package Practice.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Bob", 78),
                new Student("Alice", 85),
                new Student("Brush", 66),
                new Student("Newton", 99));
        Students students = new Students(list);
        System.out.println(students.getScore("Bob"));
    }
}

class Students{
    List<Student> list;
    Map<String,Integer> map;
    Students(List<Student> list){
        this.list = list;
        map = new HashMap<>();
        for (Student student : list) {
            map.put(student.name,student.score);
        }
    }

    int getScore(String name){
        Integer score = this.map.get(name);
        if(score == null){
            return -1;
        }
        else{
            return score.intValue();
        }
    }

    Integer fineInList(String name){
        for (Student student : list) {
            if(name.equals(student.name)){
                return student.score;
            }
        }
        return null;
    }
}

class Student{
    String name;
    int score;

    Student(String name,int score){
        this.name = name;
        this.score = score;
    }
}
