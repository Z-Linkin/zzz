package reflectdemo;

public class Demo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void introduce(String content) {
        System.out.println("我是" + this.name + "今年" + this.age + "," + content);
    }
}
