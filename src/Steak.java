// Steak.java
public class Steak implements IMenuItem {
    private String name;
    private double price;
    private String description;
    private Discount discount;

    public Steak() {
        this.name = "Steak";
        this.price = 21.5;
        this.description = "Steak for Non-Vegetarians";
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