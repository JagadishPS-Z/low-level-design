package Decorator;

import Pizza.BasePizza;

public class Jalepeno extends PizzaDecorator{

    public Jalepeno(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 4;
    }
}
