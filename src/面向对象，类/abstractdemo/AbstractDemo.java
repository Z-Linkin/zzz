package abstractdemo;

//静态类不能被实例化，被final修饰的类不能被继承
public abstract class AbstractDemo {
    String name = "我是抽象类的一个成员变量";
    //抽象类，方法没有方法体
    abstract void showName();
}
