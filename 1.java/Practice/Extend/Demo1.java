package Practice.Extend;

public class Demo1 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}
class Fu{
    String name = "Fu";
}
class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name); //就近原则
        System.out.println(this.name); //本类中name
        System.out.println(super.name); //父类中name
    }
}
