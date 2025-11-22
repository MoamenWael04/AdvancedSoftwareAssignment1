// CheeseBurger.java
public class CheeseBurger implements IMenuItem {
    private String name;
    private double price;
    private String description;
    private Discount discount;

    public CheeseBurger() {
        this.name = "Cheese Burger";
        this.price = 11.5;
        this.description = "Cheese Burger for Children!";
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