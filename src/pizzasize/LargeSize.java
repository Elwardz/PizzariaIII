package pizzasize;

import entities.Pizza;

public class LargeSize extends PizzaSizeDecorator {

    Pizza pizza;

    public LargeSize(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " (Large)";
    }

    @Override
    public double cost() {
        return pizza.cost() + 3.00;
    }
}
