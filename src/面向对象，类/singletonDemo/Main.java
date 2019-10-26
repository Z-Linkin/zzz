package singletonDemo;

public class Main {
    public static void main(String[] args) {
        SingleDemo singleDemo = SingleDemo.getSingleDemo();
        singleDemo.show();
    }
}
