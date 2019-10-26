package demo;

import demo.Customer;

public class StudentCustomer extends Customer{
    private float moneyInCard;

    public StudentCustomer() {

    }

    public StudentCustomer(float moneyInCard) {
        this.moneyInCard = moneyInCard;
    }

    public StudentCustomer(String name, float money, float moneyInCard) {
        super(name, money);
        this.moneyInCard = moneyInCard;
    }

    public StudentCustomer(float moneyInCard, String name, float money) {
        this.moneyInCard = moneyInCard;
    }

    public StudentCustomer(String name, float money) {

    }
    //重写
    @Override
    public void pay(Food food) {
        System.out.println("我是学生");
        super.pay(food);
    }

    //重载
    public void payByCard(Food f){
        if (this.moneyInCard - f.getPrice() >= 0) {
            this.moneyInCard = this.moneyInCard - f.getPrice();
            System.out.println("我卡里有钱，你随便");
            System.out.println("我还有" + this.moneyInCard + "元");
        } else {
            System.out.println("我不pay，王者代练可以吗?");
        }
    }

}
