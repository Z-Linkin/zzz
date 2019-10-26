package Card;

import java.util.Scanner;

public class Card {
    private String suit;
    private String rank;
    private int value;

    public Card(String suit,int value){
        int values[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        String ranks[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K","joker","JOKER"};
        this.suit=suit;
        this.value=value;
        int x=0;
        for (;value!=values[x];x++);
        this.rank=ranks[x];
    }

    public int getValue() {
        return value;
    }

    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }

    public static void OutputPoker(){
        int x=1;
        for (int y=1;y<7;y++){
            switch (y){
                case 1:
                    for (;x<14;x++){
                        Card card=new Card("spade",x);
                        System.out.print(card.getSuit()+""+card.getRank()+"  ");
                    }
                    System.out.println();
                    x=1;
                    break;
                case 2:
                    for (;x<14;x++){
                        Card card=new Card("club",x);
                        System.out.print(card.getSuit()+""+card.getRank()+"  ");
                    }
                    System.out.println();
                    x=1;
                    break;
                case 3:
                    for (;x<14;x++){
                        Card card=new Card("heart",x);
                        System.out.print(card.getSuit()+""+card.getRank()+"  ");
                    }
                    System.out.println();
                    x=1;
                    break;
                case 4:
                    for (;x<14;x++){
                        Card card=new Card("diamond",x);
                        System.out.print(card.getSuit()+""+card.getRank()+"  ");
                    }
                    System.out.println();
                    x=1;
                    break;
                case 5:
                    for (;x<16;x++){
                        Card card=new Card(" ",x);
                        if(x>13)
                            System.out.print(card.getSuit()+" "+card.getRank()+" ");
                    }
                    System.out.println();
                    x=1;
                    break;
            }
        }
    }

    public void  setSuit(int value,int suit){
        int values[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
        String ranks[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        switch (suit){
            case 1:
                this.suit="spade";
                break;
            case 2:
                this.suit="club";
                break;
            case 3:
                this.suit="heart";
                break;
            case 4:
                this.suit="diamond";
                break;
        }
        this.value=value;
        int x=0;
        for (;(int)value!=values[x];x++);
        this.rank=ranks[x];
    }
}
