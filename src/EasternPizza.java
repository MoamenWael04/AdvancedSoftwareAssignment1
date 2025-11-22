// EasternPizza.java
public class EasternPizza implements IMenuItem {
    private String name;
    private double price;
    private String description;
    private Discount discount;

    public EasternPizza() {
        this.name = "Eastern Pizza";
        this.price = 12.0;
        this.description = "Easter Pizza for Non-Vegetarians!";
        this.discount = new Discount(new PizzaDiscount());
    }

    public void setDiscountStrategy(IDiscountStrategy strategy) {
        this.discount.setStrategy(strategy);
    }

    @Override public String getName() { return name; }
    @Override public double getPrice() { return price; }
    @Override public String getDescription() { return description; }
    @Override public double getFinalPrice() { return discount.apply(price); }
}