public interface IPayment {
    void pay(Order order);
}



class CashPayment implements IPayment{
    @Override
    public void pay(Order order) {
        System.out.println("the customer paid with cash : " + order.getTotalPrice());
    }
}

class CreditCardPayment implements IPayment{
    @Override
    public void pay(Order order) {
        System.out.println("the customer paid with credit card : " + order.getTotalPrice());
    }
}


class MobileWalletPayment implements IPayment{
    @Override
    public void pay(Order order) {
        System.out.println("the customer paid with mobile wallet : " + order.getTotalPrice());
    }
}
