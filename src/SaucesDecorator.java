class SaucesDecorator extends MenuItemDecorator{
    public SaucesDecorator(IMenuItem menuItem){
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
