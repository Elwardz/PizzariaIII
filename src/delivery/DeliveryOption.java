package delivery;

import entities.Pizza;
import pizzasize.ExtraLargeSize;
import pizzasize.LargeSize;

public class DeliveryOption extends Pizza {

    Pizza pizza;
    private double distance;
    private final double BASE_DELIVERY_FEE = 5.00;
    private final double FEE_PER_KM = 0.50;
    private final double MIN_DISTANCE = 1.00; // Limite mínimo de distância
    private final double MAX_DISTANCE = 8.10; // Limite máximo de distância
    private final double TAX_RATE = 0.10; // Imposto de 10% sobre o frete

    public DeliveryOption(Pizza pizza, double distance) {
        if (distance < MIN_DISTANCE || distance > MAX_DISTANCE) {
            throw new IllegalArgumentException("Distance must be between 1 and 8.10"); // Validar a distância exception
        }
        this.pizza = pizza;
        this.distance = distance;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with delivery (" + distance + " Km)";
    }

    @Override
    public double cost() {
        double baseCost = pizza.cost();

        // Calcula o frete com base na distância
        double deliveryFee = BASE_DELIVERY_FEE + (FEE_PER_KM * distance);

        // Aplica desconto no frete se a pizza for grande ou extra grande
        if (pizza instanceof LargeSize || pizza instanceof ExtraLargeSize) {
            deliveryFee *= 0.80;
        }

        // Calcula o imposto sobre o frete
        double deliveryTax = deliveryFee * TAX_RATE;

        // Soma o custo total (custo da pizza + frete + imposto sobre o frete)
        return baseCost + deliveryFee + deliveryTax;
    }
}
