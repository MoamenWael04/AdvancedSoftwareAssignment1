class MobileWalletPayment implements IPayment{
    @Override
    public void pay(Order order) {
        System.out.println("The customer paid with Mobile Wallet : " + order.getTotalPrice() + "$");
    }
}
