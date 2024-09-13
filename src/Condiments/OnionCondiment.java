package Condiments;

import entities.Pizza;

public class OnionCondiment extends PizzaCondimentsDecorator{

    Pizza pizza;

    public OnionCondiment(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Onion";
    }

    @Override
    public double cost() {
        return 0.50 + pizza.cost();
    }
}
