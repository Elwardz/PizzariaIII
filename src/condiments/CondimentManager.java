package condiments;

import entities.Pizza;
import java.util.ArrayList;
import java.util.List;

public class CondimentManager {

    private List<PizzaCondimentsDecorator> condiments = new ArrayList<>();
    private final int MAX_CONDIMENTS = 5;

    public void addCondiment(PizzaCondimentsDecorator condiment) {
        if (condiments.size() < MAX_CONDIMENTS) {
            condiments.add(condiment);
        } else {
            System.out.println("Too many condiments, You cannot add more than 5 condiments!");
        }
    }

    public List<PizzaCondimentsDecorator> getCondiments() {
        return condiments;
    }

    public double calculateCost(Pizza pizza) {
        double totalCost = pizza.cost();
        for (PizzaCondimentsDecorator condiment : condiments) {
            totalCost += condiment.cost();
        }
        return totalCost;


    }
}