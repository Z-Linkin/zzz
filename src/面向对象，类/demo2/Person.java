package demo2;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected void walk(){
        System.out.println("人在走");
    }
}
