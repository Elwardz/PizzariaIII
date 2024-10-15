package composite;

import java.util.ArrayList;
import java.util.List;

public class PizzaGroup extends MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String groupName;

    public PizzaGroup(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder(groupName + ":\n");
        for (MenuComponent component : menuComponents) {
            description.append("  ").append(component.getDescription()).append("\n");
        }
        return description.toString();
    }

    @Override
    public double cost() {
        double totalCost = 0.0;
        for (MenuComponent component : menuComponents) {
            totalCost += component.cost();
        }
        return totalCost;
    }
}
