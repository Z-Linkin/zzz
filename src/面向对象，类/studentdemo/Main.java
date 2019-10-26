package studentdemo;

public class Main {
    public static void main(String[] args) {
        Student hljj = new Student("hljj", "男");
        String detail = "我超勇的";
        hljj.introduce(detail);
        hljj.study();
    }

}
