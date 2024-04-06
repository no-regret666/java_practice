package Practice.Polymorphism;

public class Person {
    private String name;
    private int age;

    public Person(){
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public void keepPet(Dog dog,String something){
//        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
//        dog.eat(something);
//    }
//
//    public void keepPet(Cat cat,String something){
//        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
//        cat.eat(something);
//    }

    //想要一个方法，能接收所有的动物，包括猫，包括狗
    //方法的形参：可以写这些类的父亲 Animal
    public void keepPet(Animal a,String something){
        //先判断a是否为Dog类型，如果是，则强转为Dog类型，准换之后变量名为d
        //如果不是，则不强转，结果直接是false
        if(a instanceof Dog d) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的狗");
            d.eat(something);
        }
        else if(a instanceof Cat c){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的猫");
            c.eat(something);
        }
        else{
            System.out.println("没有这种动物");
        }
    }
}
