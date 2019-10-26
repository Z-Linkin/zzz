package abstractdemo;

public class ExtendsDemo extends AbstractDemo {
    private int age = 18;

    //子类实现父类抽象方法
    @Override
    void showName() {
        System.out.println("I am " + this.age);
    }
}
