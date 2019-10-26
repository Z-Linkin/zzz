package boxdemo;

public class Main {
    public static void main(String[] args) {
//Integer类只对-128~127之间的对象做了缓存，
// (Integer)127 == (Integer)127两边装箱后，实际指向堆
// 内存中同一个对象，(Integer)129 == (Integer)129
// ，装箱为引用类型后，没有做缓存，指向堆内存中不同对象，所以比较结果为false。
        System.out.println((Integer) 127 == (Integer) 127);
        System.out.println((Integer) 129 == (Integer) 129);
        System.out.println(((Integer) 127).equals((Integer) 127));
        System.out.println(((Integer) 129).equals((Integer) 129));
    }
}