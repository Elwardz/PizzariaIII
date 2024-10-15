package condiments;

import entities.Pizza;

public class OliveCondiment extends PizzaCondimentsDecorator{

    Pizza pizza;

    public OliveCondiment(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olive";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.20;
    }
}
