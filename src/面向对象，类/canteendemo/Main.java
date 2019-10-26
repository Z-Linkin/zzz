package canteendemo;


import java.lang.reflect.Field;

//这是备课时候写的例子
public class Main {
    public static void main(String[] args) {
        //先实例化一个食堂对象
        Canteen honggaoliangCanteen = new Canteen();
        //名字设为红高粱
        honggaoliangCanteen.setCanteenName("红高粱");
        //实例化一个学生顾客
        StudentCustomer studentHljj = new StudentCustomer(10, 20);
        //食堂展示菜单
        honggaoliangCanteen.showMenu();
        //学生点餐
        Food noodle = studentHljj.order("重庆小面", 10);
        honggaoliangCanteen.makeFood(noodle);
        //付款
        //反射偷hljj的钱
//        changeMoney(studentHljj);

        //用卡里的钱
//        studentHljj.payByCard(noodle.getPrice());
        studentHljj.pay(noodle.Price());

//        //实例化一个普通顾客
//        Customer customer = new Customer(10);
//        Food rice = customer.order("米饭", 1);
//        honggaoliangCanteen.makeFood(rice);
//        customer.pay(rice.getPrice());

        //多态demo
        Customer customer = new StudentCustomer(10,10);
        customer.pay(10);

    }

    static void changeMoney(StudentCustomer studentHljj) {
        //反射偷hljj的钱
        Class stCustomer = studentHljj.getClass();
        try {
            Field field = stCustomer.getDeclaredField("moneyInCard");
            field.setAccessible(true);
            field.set(studentHljj, 0);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
