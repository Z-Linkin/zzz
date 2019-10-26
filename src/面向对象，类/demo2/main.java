package demo2;

public class main {
    //多态的例子
    public static void main(String[] args) {
        Person person1 = new Person("hljj", 18);
        Student student = new Student("ys", 18, "nan");
        person1.walk();
        student.walk();
        student.talk();
    }
}
