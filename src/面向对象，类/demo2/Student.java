package demo2;

public class Student extends Person{
    String gender ;
    public Student(String name, int age,String gender) {
        super(name, age);
        this.gender=gender;
    }
    public void walk(){
        System.out.println("学生在走");
    }
    public void talk(){
        System.out.println("学生在talk");
    }

}
