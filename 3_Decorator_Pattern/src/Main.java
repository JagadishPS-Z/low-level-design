import Decorator.Cheese;
import Decorator.Mushroom;
import Pizza.BasePizza;
import Pizza.VegDelight;

public class Main {
    public static void main(String[] args) {
        // BasePizza pizza = new Margherita();
        BasePizza pizza = new Mushroom(new Cheese(new VegDelight()));
        System.out.println("Total Pizza Cost: $" + pizza.getCost());
    }
}
