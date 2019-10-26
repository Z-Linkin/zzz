package canteendemo;

public class StudentCustomer extends Customer {
    private float moneyInCard;

    public StudentCustomer(float money, float moneyInCard) {
        super(money);
        this.moneyInCard = moneyInCard;
        System.out.println("我是一个只有" + this.moneyInCard + "元钱的学生");
    }

    @Override
    public boolean pay(float cost) {
        System.out.println("选择了现金支付");
        return super.pay(cost);
    }

    public void payByCard(float cost) {
        if (moneyInCard - cost >= 0) {
            moneyInCard = moneyInCard - cost;
            System.out.println("选择了学生卡支付");
            System.out.println("支付成功");
            System.out.println("我卡里只有" + moneyInCard + "元了");
        } else {
            System.out.println("我卡里只有" + moneyInCard + "元了");
            System.out.println("支付失败");
        }
    }
}