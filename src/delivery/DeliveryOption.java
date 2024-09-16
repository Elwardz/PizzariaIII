package delivery;

import entities.Pizza;

public class DeliveryOption extends Pizza {

    Pizza pizza;
    private double distance;
    private final double BASE_DELIVERY_FEE = 5.00;
    private final double FEE_PER_KM = 0.50;

    public DeliveryOption(Pizza pizza,double distance) {
        this.pizza = pizza;
        this.distance = distance;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with delivery";
    }

    @Override
    public double cost() {
        double baseCost = pizza.cost();
        double deliveryFee = BASE_DELIVERY_FEE + (FEE_PER_KM * distance);
        return baseCost + deliveryFee;

    }


    // Saquei ideia - Distancia - (Km)  O frete vai variar de acordo com a distancia, quanto maior a distancia mais caro fica a taxa do frete.


}