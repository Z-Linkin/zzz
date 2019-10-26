package reflectdemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        //new一个对象
        Demo demo=new Demo("hljj",18);
        //获得类的名称
        Class demoClass = Demo.class;
        System.out.println(demoClass.getName());
        //获得声明的变量
        Field[] fields = demoClass.getDeclaredFields();
        for (Field f : fields
        ) {
            System.out.println(f.toString());
        }

        //获得所以声明的方法
        Method[] methods = demoClass.getDeclaredMethods();
        for (Method m : methods
        ) {
            System.out.println(m.toString());
        }

        //调用私有方法，需要捕获异常，现在可以不管
        try {
            Method method = demoClass.getDeclaredMethod("introduce", String.class);
            method.setAccessible(true);
            method.invoke(demo,"我会女装");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //访问修改私有属性
        try {
            Field field=demoClass.getDeclaredField("age");
            field.setAccessible(true);
            field.set(demo,17);
            System.out.println(demo.getAge());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
