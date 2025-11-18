package Decorator;

import Pizza.BasePizza;

public class Mushroom extends PizzaDecorator{

    public Mushroom(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 2;
    }
}
