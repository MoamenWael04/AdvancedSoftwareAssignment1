import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public interface IMenu {

    void displayMenu();
    IMenuItem createMenuItem(String name);

}

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
