public class nihao{
    public static int GetEvenNum(double num1,double num2){
        int s=(int)num1+(int)(Math.random()*(num2-num1));
        return s;
    }

    public static void main(String[] args) {
        System.out.println(GetEvenNum(1.0,3.0));
    }
}