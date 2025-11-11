import java.util.ArrayList;
import java.util.List;

public interface IObserver
{
    void update(Order order);
}


class Kitchen implements IObserver{
@Override
    public void update(Order order) {
    System.out.println("kitchen received new order:");
    for(IMenuItem item : order.getSelectedItems()){
        System.out.println("+" + item.getName());
    }
    }
}


class Waiter implements IObserver{
    @Override
    public void update(Order order) {
        System.out.println("waiter received new order:");
        System.out.println("waiter is going to receive " + order.getTotalPrice() + "$  for the order");

    }
}
