package Decorator;

import Pizza.BasePizza;

public class PizzaDecorator implements BasePizza {
    protected BasePizza basePizza;

    public PizzaDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost();
    }
}
