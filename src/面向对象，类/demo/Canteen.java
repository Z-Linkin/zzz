package demo;

public class Canteen {
    private String name;

    public Canteen(String name) {
        this.name = name;
    }

    public Food makeFood(String name, float price) {
        Food food = new Food(name, price);
        return food;
    }
}
