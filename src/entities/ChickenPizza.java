package entities;

public class ChickenPizza extends Pizza {

    public ChickenPizza() {
        description = "Chicken Pizza";
    }

    @Override
    public double cost() {
        return 9.00;
    }
}
