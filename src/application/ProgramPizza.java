package application;

import Condiments.BaconCondiment;
import Condiments.ExtraCheeseCondiment;
import Condiments.OnionCondiment;
import entities.ChickenPizza;
import entities.PepperoniPizza;
import entities.Pizza;

public class ProgramPizza {

    public static void main(String[] args) {

        Pizza pizza1 = new PepperoniPizza();
        pizza1 = new BaconCondiment(pizza1);
        pizza1 = new ExtraCheeseCondiment(pizza1);
        System.out.println(pizza1.getDescription() + ": $" + pizza1.cost());

        Pizza pizza2 = new ChickenPizza();
        pizza2 = new OnionCondiment(pizza2);
        System.out.println(pizza2.getDescription() + ": $" + pizza2.cost());

    }
}