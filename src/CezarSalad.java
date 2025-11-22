public class CezarSalad implements IMenuItem {
    private String name;
    private double price;
    private String description;
    private Discount discount;  // Context

    public CezarSalad() {
        this.name = "Cezar Salad";
        this.price = 5.7;
        this.description = "Cezar Salad for Vegetarians!";
        this.discount = new Discount(new SaladDiscount());  // default strategy
    }

    public void setDiscountStrategy(IDiscountStrategy strategy) {
        this.discount.setStrategy(strategy);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getFinalPrice() {
        return discount.apply(price);
    }
}