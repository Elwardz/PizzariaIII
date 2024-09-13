package entities;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        description = "Pepperoni Pizza";
    }

    @Override
    public double cost() {
        return 10.00;
    }
}
