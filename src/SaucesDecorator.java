// SaucesDecorator.java
public class SaucesDecorator extends MenuItemDecorator {
    private static final double SAUCES_PRICE = 1.5;

    public SaucesDecorator(IMenuItem menuItem) {
        super(menuItem);
    }

    @Override public String getName() { return menuItem.getName() + " with sauces"; }
    @Override public String getDescription() { return menuItem.getDescription() + " with sauces"; }
    @Override public double getPrice() { return menuItem.getPrice() + SAUCES_PRICE; }

    @Override
    public double getFinalPrice() {
        return menuItem.getFinalPrice() + SAUCES_PRICE;
    }
}