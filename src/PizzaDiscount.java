 class PizzaDiscount implements IDescountStrategy{
    @Override
     public double applyDiscount(double price) {
        return price * 0.9;
    }
}
