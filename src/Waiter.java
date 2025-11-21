class Waiter implements IObserver{
    @Override
    public void update(Order order) {
        System.out.println("\n*** Waiter received New Order(s) ***");
        System.out.println("------------------------------------");
        for(IMenuItem item : order.getSelectedItems()){
            System.out.println(" + " + item.getName());
        }
        System.out.println("Waiter is going to receive " + order.getTotalPrice() + "$  (after discount) for the Order!");
    }
}