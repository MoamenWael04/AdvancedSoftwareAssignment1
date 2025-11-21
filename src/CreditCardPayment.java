class CreditCardPayment implements IPayment{
    @Override
    public void pay(Order order) {
        System.out.println("the customer paid with credit card : " + order.getTotalPrice());
    }
}