package application;

import entities.AtumPizza;
import entities.ChickenPizza;
import composite.MenuComponent;
import composite.PizzaGroup;
import static java.awt.SystemColor.menu;

public class ProgramPizza {

    public static void main(String[] args) {
        // Criando pizzas a minha pizza individual
        MenuComponent atumPizza = new AtumPizza();
        MenuComponent chickenPizza = new ChickenPizza();

        // Criando Menu de pizzas salgadas
        PizzaGroup saltyPizzas = new PizzaGroup("Salty Pizzas");
        saltyPizzas.add(atumPizza);
        saltyPizzas.add(chickenPizza);

        // Criando Menu de "Pizzas da Casa"
        PizzaGroup housePizzas = new PizzaGroup("House Pizzas");
        housePizzas.add(new AtumPizza()); // Pode adicionar mais pizzas aqui

        // Grupo principal de pizzas
        PizzaGroup allPizzas = new PizzaGroup("All Pizzas");
        allPizzas.add(saltyPizzas);
        allPizzas.add(housePizzas);

        // Imprimindo o menu
        System.out.println(allPizzas.getDescription());

        // Custo total
        System.out.println("Total cost: $" + allPizzas.cost()); //
    }
}
