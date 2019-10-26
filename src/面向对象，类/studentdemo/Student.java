package studentdemo;

public class Student extends Object {
    //成员变量
    private String name;
    private String gender;

    //构造方法
    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    //方法
    public void introduce(String detail) {
        System.out.println(this.name + "是" + this.gender + "," + detail);
    }

    //方法
    public void study() {
        String content = "我就是学习小王子";
        System.out.println(content);
    }
}
