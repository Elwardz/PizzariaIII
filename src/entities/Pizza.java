package entities;

import composite.MenuComponent;

public abstract class Pizza extends MenuComponent {

    String description = "Unknow Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
