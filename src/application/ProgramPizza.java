package application;

import condiments.*;
import entities.*;
import pizzasize.*;
import delivery.*;

public class ProgramPizza {

    public static void main(String[] args) {

        // Pedido de uma pizza online com entrega
        Pizza pizza1 = new PepperoniPizza();
        pizza1 = new BaconCondiment(pizza1);
        pizza1 = new ExtraCheeseCondiment(pizza1);
        pizza1 = new LargeSize(pizza1);
        pizza1 = new DeliveryOption(pizza1, 8.5); // Entrega com distância de 8.5 km
        System.out.println(pizza1.getDescription() + ": $" + pizza1.cost());

        // Pedido de uma pizza no local sem entrega
        Pizza pizza2 = new ChickenPizza();
        pizza2 = new OnionCondiment(pizza2);
        pizza2 = new MediumSize(pizza2);
        System.out.println(pizza2.getDescription() + ": $" + pizza2.cost());
    }
}
