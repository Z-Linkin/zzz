package studysister;

public class main {
    public static void main(String[] args) {
      StudySister hljj=new StudySister("hljj");
        System.out.println(hljj.getName());
//        sisterDance(hljj);
        hljj.dance();
        hljj.setName("dressed hljj");
        System.out.println(hljj.getName());

    }

    static void sisterDance(StudySister studySister){
        studySister.dance();
    }
}
