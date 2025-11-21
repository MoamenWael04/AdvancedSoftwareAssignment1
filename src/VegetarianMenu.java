import java.util.ArrayList;
import java.util.List;

class VegetarianMenu implements IMenu {

    List<IMenuItem> menuItems;
    public VegetarianMenu(){
        menuItems = new ArrayList<>();
        menuItems.add(new ItalianPizza());
        menuItems.add(new CezarSalad());
    }
    @Override
    public void displayMenu() {
        System.out.println("=== Vegertarian Menu ===");
        for (IMenuItem item : menuItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
            System.out.println("  " + item.getDescription());
        }
    }

    @Override
    public IMenuItem createMenuItem(String name) {
        switch (name.toLowerCase()){
            case "italian pizza":
                return new ItalianPizza();
            case "cezar salad":
                return new CezarSalad();
            default:
                System.out.println("Invalid menu item!");
                return null;
        }
    }

}
