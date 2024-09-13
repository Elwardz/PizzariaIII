package entities;

public class AtumPizza extends Pizza {

    public AtumPizza() {
        description = "Atum Pizza";
    }

    @Override
    public double cost() {
        return 12.00;
    }
}
