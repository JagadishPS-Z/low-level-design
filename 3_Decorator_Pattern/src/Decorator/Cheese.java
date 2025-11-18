package Decorator;

import Pizza.BasePizza;

public class Cheese extends PizzaDecorator{

    public Cheese(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 3;
    }
}
