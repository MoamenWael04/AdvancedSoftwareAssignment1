public class BillPrinter implements IReceiptPrinter {

    @Override
    public void print(Order order) {
        System.out.println("\n========== FINAL BILL ==========");

        for (IMenuItem item : order.getSelectedItems()) {
            System.out.println("Item: " + item.getName()
                    + " - Price (after discount): " + item.getFinalPrice());
        }

        System.out.println("--------------------------------");
        System.out.println("TOTAL: " + order.getTotalPrice());
        System.out.println("================================");
    }
}
