package entities;

public class MargueritaPizza extends Pizza{

    public MargueritaPizza() {
        description = "Marguerita";
    }

    @Override
    public double cost() {
        return 15.00;
    }
}
