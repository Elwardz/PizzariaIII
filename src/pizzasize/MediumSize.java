package pizzasize;

import entities.Pizza;

public class MediumSize extends PizzaSizeDecorator {

    Pizza pizza;

    public MediumSize(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " (Medium Size)";
    }

    @Override
    public double cost() {
        return pizza.cost(); // Tamanho Padrao da Pizza
    }
}
