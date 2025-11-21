import java.util.ArrayList;
import java.util.List;

class NonVegetarianMenu implements IMenu {
    List<IMenuItem> menuItems;
    public NonVegetarianMenu(){
        menuItems = new ArrayList<>();
        menuItems.add(new EasternPizza());
        menuItems.add(new Steak());
    }
    @Override
    public void displayMenu() {
        System.out.println("=== non-Vegertarian Menu ===");
        for (IMenuItem item : menuItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
            System.out.println("  " + item.getDescription());
        }
    }
    @Override
    public IMenuItem createMenuItem(String name) {
        switch (name.toLowerCase()){
            case "eastern pizza":
                return new EasternPizza();
            case "steak":
                return new Steak();
            default:
                System.out.println("Invalid menu item!");
                return null;
        }
    }
}
