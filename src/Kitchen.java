class Kitchen implements IObserver{
    @Override
    public void update(Order order) {
        System.out.println("\n*** Kitchen received New Order(s) ***");
        System.out.println("-----------------------------------");
        for(IMenuItem item : order.getSelectedItems()){
            System.out.println(" + " + item.getName());
        }
    }
}