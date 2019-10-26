package studysister;

class StudySister {
    private String name;
     int age;
     //无参构造方法
    public StudySister(){

    }
    public StudySister(String names) {
        this.name = names;
    }

    //getter()
    public String getName() {
        return name;
    }
    //setter()
    public void setName(String name) {
        this.name = name;
    }

    public void dance(){
        String s = "I can dance!";
        System.out.println(s);
    }
}
