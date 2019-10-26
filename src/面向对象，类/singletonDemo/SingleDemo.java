package singletonDemo;

public class SingleDemo {
    //定义唯一实例
    private static SingleDemo singleDemo = null;

    //构造方法私有，其他地方就不能实例这个类
    private SingleDemo() {
    }

    public static SingleDemo getSingleDemo() {
        if (singleDemo == null) {
            singleDemo = new SingleDemo();
        }
        return singleDemo;
    }

    public void show() {
        System.out.println("我是单例模式的对象");
    }
}
