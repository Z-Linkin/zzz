package 皇城PK;

import Card.Player;

import java.util.Scanner;

public class Pet {
    private String name;
    private int HP;
    private String 属性;
    private int LV;
    private Skill A=new Skill();
    private Skill B=new Skill();

    public void setCriticalStrikePossibility(int criticalStrikePossibility1,int criticalStrikePossibility2) {
        A.setCriticalStrikePossibility(criticalStrikePossibility1);
        B.setCriticalStrikePossibility(criticalStrikePossibility2);
    }

    public void inputIntroduction(String AIntroduction,String BIntroduction){
        A.inputIntroduction(AIntroduction);
        B.inputIntroduction(BIntroduction);
    }

    public Pet(String name,int HP,String 属性,int LV,String A,String B,int AInjury,int BInjury){
        this.name=name;
        this.HP=HP;
        this.属性=属性;
        this.LV=LV;
        this.A.Name(A);
        this.B.Name(B);
        this.A.Injury(AInjury);
        this.B.Injury(BInjury);
    }

    public int getHP() {
        return HP;
    }

    public String getName(){
        return name;
    }

    public void Strike(Pet pet){
        System.out.println("请"+this.name+"选择使用的技能");
        System.out.println("A."+A.getName()+"\t威力"+A.getInjury()+"\t效果："+A.getIntroduction());
        System.out.println("B."+B.getName()+"\t威力"+B.getInjury()+"\t效果："+B.getIntroduction());
        Scanner scanner=new Scanner(System.in);
        String UsageOfSkill=scanner.next();
        switch (UsageOfSkill){
            case "A":
                if(A.getCriticalStrikePossibility()==1){
                    System.out.println(this.name+"对"+pet.name+"使用了"+this.A.getName()+",并打出暴击,"+pet.name+"受到重创");
                    pet.HP=pet.HP-A.getInjury()*2;
                }else{
                    System.out.println(this.name+"对"+pet.name+"使用了"+this.A.getName()+","+pet.name+"受到重创");
                    pet.HP=pet.HP-A.getInjury();
                }
                break;
            case "B":
                if(B.getCriticalStrikePossibility()==1){
                    System.out.println(this.name+"对"+pet.name+"使用了"+this.B.getName()+",并打出暴击,"+pet.name+"受到重创");
                    pet.HP=pet.HP-B.getInjury()*2;
                }else{
                    System.out.println(this.name+"对"+pet.name+"使用了"+this.B.getName()+","+pet.name+"受到重创");
                    pet.HP=pet.HP-B.getInjury();
                }
                break;
        }
        System.out.println(pet.name+"体力为"+pet.HP);
    }

    public void Appearance(){
        System.out.println(name+"登场了 等级:"+LV+" 属性："+属性+" 体力"+HP);
    }

    public void FirstAction(){
        System.out.println(this.name+"先手");
    }

    public void Fight(Pet pet1){
        pet1.Appearance();
        this.Appearance();
        pet1.FirstAction();
        for (;pet1.getHP()>0||this.getHP()>0;){
            pet1.Strike(this);
            this.Strike(pet1);
        }
        if(pet1.getHP()>0){
            System.out.println(this.getName()+"战败，恭喜"+pet1.getName()+"获得胜利！");
        }else if (this.getHP()>0){
            System.out.println(pet1.getName()+"战败，恭喜"+this.getName()+"获得胜利！");
        }
    }
}
