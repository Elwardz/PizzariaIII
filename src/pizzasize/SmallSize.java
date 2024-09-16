package pizzasize;

import entities.Pizza;

public class SmallSize extends PizzaSizeDecorator {

    Pizza pizza;

    public SmallSize(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " (Small)";
    }

    @Override
    public double cost() {
        return pizza.cost() - 2.00;
    }
}
