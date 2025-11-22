// ItalianPizza.java
public class ItalianPizza implements IMenuItem {
    private String name;
    private double price;
    private String description;
    private Discount discount;

    public ItalianPizza() {
        this.name = "Italian Pizza";
        this.price = 10.0;
        this.description = "Italian Pizza for Vegetarians!";
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