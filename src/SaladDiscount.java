public class SaladDiscount implements IDiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.85;
    }
}