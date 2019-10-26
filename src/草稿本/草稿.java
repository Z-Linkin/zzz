import java.util.Scanner;

public class 草稿{
    static final double PI=3.14;
    static int id;
    public static void method(){
        id=3;
        System.out.println(id);
    }

    public static void method2(){
        System.out.println(草稿.PI);
        草稿.method();
        System.out.println(草稿.id);
    }

    public static void 求和(int Array[]){
        float sum=0;
        for (int x=0;x<Array.length;x++){
            sum=sum+Array[x];
        }
        System.out.println(sum);
    }

    public static int random(int num1,int num2){
        int s=num1+(int)Math.random()*(num2-num1);
            return s;
    }

}