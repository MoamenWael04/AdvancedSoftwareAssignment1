class ExtraCheeseDecorator extends MenuItemDecorator{
    public ExtraCheeseDecorator(IMenuItem menuItem){
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
