package Condiments;

import entities.Pizza;

public class ExtraCheeseCondiment extends PizzaCondimentsDecorator {

    Pizza pizza;

    public ExtraCheeseCondiment(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
       return pizza.getDescription() + ", Extra Cheese";
    }

    public double cost() {
        return 0.80 + pizza.cost();
    }
}