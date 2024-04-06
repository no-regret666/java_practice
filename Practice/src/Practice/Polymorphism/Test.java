package Practice.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王",30);
        Dog d = new Dog(2,"黑");
        p.keepPet(d,"骨头");
    }
}