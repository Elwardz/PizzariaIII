package condiments;

import entities.Pizza;

public class OnionCondiment extends PizzaCondimentsDecorator {

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
        return pizza.cost() + 0.50;
    }
}
