package delivery;

import entities.Pizza;

public class DeliveryOption extends Pizza {

    Pizza pizza;

    public DeliveryOption(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with delivery";
    }

    @Override
    public double cost() {
        return pizza.cost() + 7.00;
    }


    // Saquei ideia - Distancia - (Km)  O frete vai variar de acordo com a distancia, quanto maior a distancia mais caro fica a taxa do frete.


}