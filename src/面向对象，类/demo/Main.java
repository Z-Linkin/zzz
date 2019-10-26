package demo;
//这是课上写的例子
public class Main {
    public static void main(String[] args) {
        Canteen zhongXinCanteen = new Canteen("中心食堂");
        Customer chaoGe = new Customer("超哥", 100);
        String foodName = chaoGe.order("重庆小面");
        Food food = zhongXinCanteen.makeFood(foodName, 100);
        chaoGe.pay(food);
        StudentCustomer studentCustomer1=new StudentCustomer();
        StudentCustomer studentCustomer = new StudentCustomer(100, "ChaoGe", 120);
        StudentCustomer studentCustomer2=new StudentCustomer("ChaoGe",120);
//        String foodName = studentCustomer.order("重庆小面");
//        Food food = zhongXinCanteen.makeFood(foodName, 100);
        studentCustomer.payByCard(food);

    }
}
