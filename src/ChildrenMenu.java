import java.util.ArrayList;
import java.util.List;

class ChildrenMenu implements IMenu {
    List<IMenuItem> menuItems;
    public ChildrenMenu(){
        menuItems = new ArrayList<>();
        menuItems.add(new ChickenNuggets());
        menuItems.add(new CheeseBurger());
    }
    @Override
    public void displayMenu() {
        System.out.println("=== Children Menu ===");
        for (IMenuItem item : menuItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
            System.out.println("  " + item.getDescription());
        }
    }
    @Override
    public IMenuItem createMenuItem(String name) {
        switch (name.toLowerCase()){
            case "chicken nuggets":
                return new ChickenNuggets();
            case "cheese burger":
                return new CheeseBurger();
            default:
                System.out.println("Invalid menu item!");
                return null;
        }
    }
}

