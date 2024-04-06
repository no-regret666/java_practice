package Practice.Interface.Demo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青",1);
        System.out.println(f.getName() + "," + f.getAge());

        f.eat();
        f.swim();
    }
}
