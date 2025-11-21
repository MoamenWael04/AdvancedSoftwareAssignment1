import java.awt.*;
import java.util.List;

public class Order
{
    List<IMenuItem> menuItems;
    double totalPrice;

    public Order(List<IMenuItem> menuItems , double totalPrice){
        this.menuItems = menuItems;
        this.totalPrice = CalculateTotal();
    }
    public double CalculateTotal(){
        double total = 0;
        for (IMenuItem item : menuItems) {
            total += item.getFinalPrice();
        }
        return total;
    }
    List<IMenuItem> getSelectedItems() {
        return menuItems;
    }
    double getTotalPrice() {
        return totalPrice;
    }

}
