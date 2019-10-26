package demo;

import java.util.Objects;

public class Customer extends Object {
    protected String name;
    protected float money;
    public Customer(){}

    public Customer(String name, float money) {
        this.name = name;
        this.money = money;
    }

    public String order(String name) {
        return name;
    }

    public void pay(Food food) {
        if (this.money - food.getPrice() >= 0) {
            this.money = this.money - food.getPrice();
            System.out.println("我有钱，你随便");
            System.out.println("我还有" + this.money + "元");
        } else {
            System.out.println("我不pay，王者代练可以吗?");
        }
    }
}
