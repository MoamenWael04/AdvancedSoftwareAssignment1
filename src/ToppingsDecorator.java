class ToppingsDecorator extends MenuItemDecorator{
    public ToppingsDecorator(IMenuItem menuItem){
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

