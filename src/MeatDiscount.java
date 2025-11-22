public class MeatDiscount implements IDiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.95;
    }
}