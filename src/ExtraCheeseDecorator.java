// ExtraCheeseDecorator.java
public class ExtraCheeseDecorator extends MenuItemDecorator {
    private static final double EXTRA_CHEESE_PRICE = 2.7;

    public ExtraCheeseDecorator(IMenuItem menuItem) {
        super(menuItem);
    }

    @Override public String getName() { return menuItem.getName() + " with extra cheese"; }
    @Override public String getDescription() { return menuItem.getDescription() + " with extra cheese"; }
    @Override public double getPrice() { return menuItem.getPrice() + EXTRA_CHEESE_PRICE; }

    @Override
    public double getFinalPrice() {
        return menuItem.getFinalPrice() + EXTRA_CHEESE_PRICE;
    }
}