
class MobileWalletPayment implements IPayment{
    @Override
    public void pay(Order order) {
        System.out.println("the customer paid with mobile wallet : " + order.getTotalPrice());
    }
}
