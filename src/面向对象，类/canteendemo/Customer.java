package canteendemo;

public class Customer {
    //怎么可能让你修改我有多少钱
    private float money;

    public Customer(){}

    public Customer(float money) {
        this.money = money;
        System.out.println("我是一个只有" + this.money + "元钱的普通顾客");
    }

    public Food order(String food, float price) {
        System.out.println("我点了" + price + "元的" + food);
        return new Food(food, price);
    }

    public boolean pay(float cost) {
        if (money - cost >= 0) {
            money = money - cost;
            System.out.println("支付成功");
            System.out.println("我只有" + money + "元了");
            return true;
        } else {
            System.out.println("我只有" + money + "元了");
            System.out.println("余额不足");
            return false;
        }
    }
}
