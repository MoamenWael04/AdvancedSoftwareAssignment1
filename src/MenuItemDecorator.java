public abstract class MenuItemDecorator implements IMenuItem {
    IMenuItem menuItem;
    public MenuItemDecorator(IMenuItem menuItem){
        this.menuItem = menuItem;
    }
    @Override
    public double getPrice() {
        return menuItem.getPrice();
    }
    @Override
    public String getDescription() {
        return menuItem.getDescription();
    }
    @Override
    public String getName() {
        return menuItem.getName();
    }

}


class ExtraCheese extends MenuItemDecorator{
    public ExtraCheese(IMenuItem menuItem){
        super(menuItem);
    }
    @Override
    public String getDescription() {
        return menuItem.getDescription() + " with extra cheese";
    }
    @Override
    public String getName() {
        return menuItem.getName() + " with extra cheese";
    }
    @Override
    public double getPrice() {
        return menuItem.getPrice() + 2.7;
    }
}
class Sauces extends MenuItemDecorator{
    public Sauces(IMenuItem menuItem){
        super(menuItem);
    }
    @Override
    public String getDescription() {
        return menuItem.getDescription() + " with sauces";
    }
    @Override
    public String getName() {
        return menuItem.getName() + " with sauces";
    }
    @Override
    public double getPrice() {
        return menuItem.getPrice() + 1.5;
    }
}
class Toppings extends MenuItemDecorator{
    public Toppings(IMenuItem menuItem){
        super(menuItem);
    }
    @Override
    public String getDescription() {
        return menuItem.getDescription() + " with toppings";
    }
    @Override
    public String getName() {
        return menuItem.getName() + " with toppings";
    }
    @Override
    public double getPrice() {
        return menuItem.getPrice() + 1.9;
    }
}
