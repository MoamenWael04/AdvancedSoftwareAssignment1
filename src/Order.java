import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<IMenuItem> selectedItems;
    private IPayment payment;

    public Order() {
        this.selectedItems = new ArrayList<>();
    }

    public void addItem(IMenuItem item) {
        selectedItems.add(item);
    }

    public List<IMenuItem> getSelectedItems() {
        return selectedItems;
    }

    public double getTotalPrice() {
        double total = 0;
        for (IMenuItem item : selectedItems) {
            total += item.getFinalPrice();
        }
        return total;
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public void processPayment() {
        if (payment != null) {
            payment.pay(this);
        }
    }
}