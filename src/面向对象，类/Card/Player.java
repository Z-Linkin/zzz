package Card;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import jdk.nashorn.internal.ir.ContinueNode;

import java.util.Scanner;

public class Player {
    private int money;
    private String name;
    private Card card1=new Card("",1);
    private Card card2=new Card("",1);
    private Card card3=new Card("",1);
    private int ThreeCardValue;

    public Player(String name,int money){
        this.name=name;
        this.money=money;
    }

    public int getMoney(){
        return money;
    }

    public static int GetEvenNum(double num1,double num2){
        int s=(int)num1+(int)(Math.random()*(num2-num1));
        return s;
    }

    public void GetCard(){
        card1.setSuit(GetEvenNum(1.0,14.0),GetEvenNum(1.0,5.0));
        card2.setSuit(GetEvenNum(1.0,14.0),GetEvenNum(1.0,5.0));
        card3.setSuit(GetEvenNum(1.0,14.0),GetEvenNum(1.0,5.0));
    }

    public void display(Player player){
        System.out.println(player.name+"所抽取的牌组是");
        System.out.print(card1.getSuit()+" "+card1.getRank()+"   ");
        System.out.print(card2.getSuit()+" "+card2.getRank()+"   ");
        System.out.println(card3.getSuit()+" "+card3.getRank()+"   ");
    }

    public void inputThreeCardVal(){
        this.ThreeCardValue=card1.getValue()+card2.getValue()+card3.getValue();
    }

    public void Compare(Player player,int tableMoney){
        inputThreeCardVal();
        player.inputThreeCardVal();
        if(this.ThreeCardValue<=player.ThreeCardValue){
            System.out.println(player.name+"获胜");
            player.money=player.money+tableMoney;
            System.out.println(player.name+"的money为"+player.money);
        }else {
            System.out.println(this.name+"获胜");
            this.money=this.money+tableMoney;
            System.out.println(this.name+"的money为"+this.money);
        }
    }

    public void Action(Player player1,Player player2,String choice,int tableMoney){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请"+player1.name+"选择一项：\nA.加筹码\tB.与其他玩家比较\tC.放弃此牌");
        choice=scanner.next();
        switch (choice){
            case "A":
                System.out.println("请输入你要加入的筹码数量：");
                int chip=scanner.nextInt();
                player1.money=player1.money-chip;
                tableMoney=tableMoney+chip;
                break;
            case "B":
                player1.Compare(player2,tableMoney);
                break;
            case "C":
                System.out.println(player2.name+"获胜");
                player2.money=player2.money+tableMoney;
                System.out.println(player2.name+"的money为"+player2.money);
                break;
            default:
                System.out.println("非法输入");
                break;
        }
    }

    public void Start(Player player1,Player player2,int tableMoney){
        System.out.println("请选择抵押金额：\nA.10\tB.20\tC.30\tD.40");
        Scanner scanner=new Scanner(System.in);
        String sum=scanner.next();
        switch (sum){
            case "A":
                player1.money=player1.money-10;
                player2.money=player2.money-10;
                tableMoney=10*2;
                break;
            case "B":
                player1.money=player1.money-20;
                player2.money=player2.money-20;
                tableMoney=20*2;
                break;
            case "C":
                player1.money=player1.money-30;
                player2.money=player2.money-30;
                tableMoney=30*2;
                break;
            case "D":
                player1.money=player1.money-40;
                player2.money=player2.money-40;
                tableMoney=40*2;
                break;
        }
        System.out.println("比赛开始，由"+player1.name+"先行");
        for (;;){
            String choice=new String();
            Action(player1,player2,choice,tableMoney);
            Action(player2,player1,choice,tableMoney);
        }
    }
}
