package 皇城PK;

import Card.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pet pet1=new Pet("宫本武藏",300,"火",15,"二天一流","空明斩",100,55);
        Pet pet2=new Pet("凯",350,"水",14,"回旋之刃","急刃风暴",60,90);
        Pet pet3=new Pet("苏烈",400,"土",15,"所向披靡","豪烈万军",80,90);
        pet1.inputIntroduction("无特殊效果","百分之五十的概率暴击打出双倍伤害,若第一次暴击后，后续的此技能必定暴击");
        pet2.inputIntroduction("百分之二十的概率暴击打出双倍伤害,若第一次暴击后，后续的此技能必定暴击","无特殊效果");
        pet3.inputIntroduction("百分之十的概率暴击打出双倍伤害,若第一次暴击后，后续的此技能必定暴击","无特殊效果");
        pet1.setCriticalStrikePossibility(0,Player.GetEvenNum(1,3));
        pet1.setCriticalStrikePossibility(Player.GetEvenNum(1,6),0);
        pet3.setCriticalStrikePossibility(Player.GetEvenNum(1,11),0);

        pet1.Fight(pet3);
    }
}
