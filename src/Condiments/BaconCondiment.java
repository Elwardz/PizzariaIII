package Condiments;

import entities.Pizza;

public class BaconCondiment extends PizzaCondimentsDecorator {

    Pizza pizza;

    public BaconCondiment(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
       return pizza.getDescription() + ", Bacon";
    }

    public double cost() {
        return 1.00 + pizza.cost();

    }
}
