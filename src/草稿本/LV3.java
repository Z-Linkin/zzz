import java.util.Scanner;

public class LV3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]menu={"糖醋里脊","韭菜炒蛋","鱼香肉丝","干锅土豆片","千页豆腐"};
        int[]price={18,12,15,18,18};
        System.out.println("欢迎管理红高粱餐厅，这是今天的菜品：");
        for (int x=0;x<5;x++){
            System.out.println(x+1+"."+menu[x]+" "+price[x]);
        }
        System.out.println("请输入想要点的菜的序号");
        int dish[]=new int[20];
        for (int x=0;x<3;x++){
            dish[x]=scanner.nextInt();
        }
        System.out.println("你选择了");
        for (int x=0;x<3;x++){
        System.out.println((x+1)+"."+menu[dish[x]-1]+(price[dish[x]-1])+"元");
        }
        int AllPrice=0;
        for (int x=0;x<3;x++){
            AllPrice=AllPrice+price[dish[x]-1];
        }
        System.out.println("共计\t"+AllPrice+"元\n");
        System.out.println("还需要点菜吗？");
        for (int y=0;y<5;y++){
            System.out.println(y+1+"."+menu[y]+" "+price[y]+"元");
        }
        System.out.println("请输入想要点的菜的序号");
        dish[3]= Integer.parseInt(scanner.next());
        System.out.println("你一共选择了：");
        for (int x=0;x<4;x++){
            System.out.println(x+1+"."+menu[dish[x]-1]+(price[dish[x]-1])+"元");
        }
        AllPrice=AllPrice+price[dish[3]-1];
        System.out.println("共计\t"+AllPrice+"元");
        String[]PayWay={"人脸支付","支付宝","微信"};
        System.out.println("请选择支付方式：");
        for (int x=0;x<3;x++){
            System.out.println(x+1+"."+PayWay[x]);
        }
        System.out.println();
        int WhichPayWay=scanner.nextInt();
        System.out.println("\n请出示付款码......");
    }
}
