package Practice.Extend.Demo2;

import Practice.Extend.Demo2.Dog;

public class SharPei extends Dog {
    //父类中的方法不能满足我们的需求了，所以需要重写

    @Override
    public void eat() {
        super.eat(); //吃狗粮
        System.out.println("狗啃骨头");
    }
}
