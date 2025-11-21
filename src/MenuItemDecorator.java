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


