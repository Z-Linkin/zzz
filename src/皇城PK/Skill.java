package 皇城PK;

public class Skill {
    private String name;
    private String introduction;
    private int injury;
    private int CriticalStrikePossibility;

    public String getName() {
        return name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public int getInjury() {
        return injury;
    }
    public int getCriticalStrikePossibility(){
        return CriticalStrikePossibility;
    }

    public void Name(String name){
        this.name=name;
    }

    public void Injury(int injury){
        this.injury=injury;
    }

    public void inputIntroduction(String introduction){
        this.introduction=introduction;
    }

    public void setCriticalStrikePossibility(int criticalStrikePossibility) {
        this.CriticalStrikePossibility = criticalStrikePossibility;
    }
}
