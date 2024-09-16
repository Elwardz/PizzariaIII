package pizzasize;

import entities.Pizza;

public class ExtraLargeSize extends PizzaSizeDecorator {

    Pizza pizza;

    public ExtraLargeSize(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " (ExtraLarge)";
    }

    @Override
    public double cost() {
        return pizza.cost() + 5.00;
    }
}
