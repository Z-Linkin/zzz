package equalsdemo;

public class Main {
    public static void main(String[] args) {
        //基本数据类型比较
        int a1 = 10;
        int a2 = 10;
//        //直接等号，比较的时数值是否相同
//        System.out.println(a1==a2);
        //装箱后等号
        Integer b1 = new Integer(130);
        Integer b2 = new Integer(130);
        int c1=130;
        int c2=130;
//        System.out.println(b1.equals(b2));
        System.out.println(b1==b2);
        System.out.println(c1==c2);
//        //equals
//        System.out.println(Integer.valueOf(a1).equals(Integer.valueOf(a2)));
        //String类型比较
//        String a1 = "hello world";
//        String a2 = new String("hello world");
//        System.out.println(a1 == a2);//堆地址不同
//        System.out.println(a1.equals(a2));//比较的内容
//        String a3 = a2;//指向相同的地址
//        System.out.println(a3==a2);
        Person person1 = new Person("hl");
        Person person2 = new Person("hl");
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
    }
}
