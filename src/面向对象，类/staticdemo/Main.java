package staticdemo;

public class Main {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutClass.hello();
        //非静态内部类创建方法，依赖外部对象
        OutClass.innerClass innerClass = outClass.new innerClass();
        //静态内部类创建方法，不依赖外部对象
        OutClass.staticInnerClass staticInnerClass = new OutClass.staticInnerClass();
    }
}
