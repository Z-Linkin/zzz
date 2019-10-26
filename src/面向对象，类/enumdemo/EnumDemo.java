package enumdemo;

public enum EnumDemo {
    SPRING("春天"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天");
    private String ChineseName;

    EnumDemo(String chineseName) {
        ChineseName = chineseName;
    }

    public String getChineseName() {
        return ChineseName;
    }

    public void setChineseName(String chineseName) {
        ChineseName = chineseName;
    }

//重写toString，返回设定的参数
    @Override
    public String toString() {
        return this.ChineseName;
    }
}
