package annotation;

//@Override:检测被该注解标注的方法是否是继承自父类的
//@Deprecated:该被注解标注的内容，表示已过时
//@SuppressWarnings:压制警告

@SuppressWarnings("all")
public class Demo1 {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
    }

    public void show2(){
        //替代show1方法
    }

}
