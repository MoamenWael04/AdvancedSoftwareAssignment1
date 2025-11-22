// ToppingsDecorator.java
public class ToppingsDecorator extends MenuItemDecorator {
    private static final double TOPPINGS_PRICE = 1.9;

    public ToppingsDecorator(IMenuItem menuItem) {
        super(menuItem);
    }

    @Override public String getName() { return menuItem.getName() + " with toppings"; }
    @Override public String getDescription() { return menuItem.getDescription() + " with toppings"; }
    @Override public double getPrice() { return menuItem.getPrice() + TOPPINGS_PRICE; }

    @Override
    public double getFinalPrice() {
        return menuItem.getFinalPrice() + TOPPINGS_PRICE;
    }
}