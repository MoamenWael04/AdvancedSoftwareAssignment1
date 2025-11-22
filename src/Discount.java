public class Discount {
    private IDiscountStrategy strategy;

    public Discount(IDiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IDiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double apply(double price) {
        return strategy.applyDiscount(price);
    }
}