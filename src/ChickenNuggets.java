// ChickenNuggets.java
public class ChickenNuggets implements IMenuItem {
    private String name;
    private double price;
    private String description;
    private Discount discount;

    public ChickenNuggets() {
        this.name = "Chicken Nuggets";
        this.price = 8.4;
        this.description = "Chicken Nuggets for Children!";
        this.discount = new Discount(new MeatDiscount());
    }

    public void setDiscountStrategy(IDiscountStrategy strategy) {
        this.discount.setStrategy(strategy);
    }

    @Override public String getName() { return name; }
    @Override public double getPrice() { return price; }
    @Override public String getDescription() { return description; }
    @Override public double getFinalPrice() { return discount.apply(price); }
}