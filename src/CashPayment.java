
class CashPayment implements IPayment{
    @Override
    public void pay(Order order) {
        System.out.println("the customer paid with cash : " + order.getTotalPrice());
    }
}