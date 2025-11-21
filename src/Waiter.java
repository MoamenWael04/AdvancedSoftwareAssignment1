class Waiter implements IObserver{
    @Override
    public void update(Order order) {
        System.out.println("waiter received new order:");
        System.out.println("waiter is going to receive " + order.getTotalPrice() + "$  for the order");

    }
}