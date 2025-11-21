class Kitchen implements IObserver{
    @Override
    public void update(Order order) {
        System.out.println("kitchen received new order:");
        for(IMenuItem item : order.getSelectedItems()){
            System.out.println("+" + item.getName());
        }
    }
}