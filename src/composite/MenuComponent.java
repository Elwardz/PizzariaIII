package composite;

    public abstract class MenuComponent {  // Aplicando a interface base que tanto os menus quanto os itens de menu(as minhas pizzas) implementarao.

        public String getDescription() {
            throw new UnsupportedOperationException();
        }

        public double cost() {
            throw new UnsupportedOperationException();
        }

        public void add(MenuComponent menuComponent) {
            throw new UnsupportedOperationException();
        }

        public void remove(MenuComponent menuComponent) {
            throw new UnsupportedOperationException();
        }

        public MenuComponent getChild(int i) {
            throw new UnsupportedOperationException();
        }
    }
