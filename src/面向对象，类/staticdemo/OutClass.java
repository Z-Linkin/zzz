package staticdemo;

public class OutClass {
    //private变量
    private String name = "hljj";

    private void say() {
        System.out.println("I am " + name);
    }
    //静态变量
    static String hello = "hello";
    //静态常量
    static final String finalHello = "finalHello";
    //非静态变量
    String notStaticHello = "notStaticHello";

    //静态方法
    static void hello() {
        System.out.println(hello);
    }

    //内部类
    class innerClass {
        String innerName = name;
        private void innerSay(){
            System.out.println(hello);
            say();
        }
    }


//静态内部类
    static class staticInnerClass {
        static String innerHello = "inner hello";
        static void hello(){
            System.out.println(innerHello);
            System.out.println();
        }
    }
}
