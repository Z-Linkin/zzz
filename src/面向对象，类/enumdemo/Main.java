package enumdemo;

public class Main {
    public static void main(String[] args) {
        System.out.println(EnumDemo.SUMMER.toString());
        //同一个枚举实例只能与相同类型的枚举实例比较。
        // 如果该枚举对象位于指定枚举对象之后，则返回正整数；反之返回负整数；否则返回零；
        System.out.println(EnumDemo.SUMMER.compareTo(EnumDemo.SUMMER));
        for (EnumDemo e : EnumDemo.values()) {
            System.out.println(e.name());
        }
    }
}
