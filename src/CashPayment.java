
class CashPayment implements IPayment{
    @Override
    public void pay(Order order) {
        System.out.println("The customer paid with Cash: " + order.getTotalPrice() + "$");
    }
}