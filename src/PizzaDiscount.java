 class PizzaDiscount implements IDiscountStrategy {
    @Override
     public double applyDiscount(double price) {
        return price * 0.9;
    }
}
