package equalsdemo;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        //重写equals,判断是不是一个地址
        if (o == this) {
            return true;
        } else if (!(o instanceof Person)) {
            return false;
        } else {
            return this.name.equals(((Person) o).name);
        }
    }
}
