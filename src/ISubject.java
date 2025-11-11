import java.util.ArrayList;
import java.util.List;

public interface ISubject
{
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
}

class Manager implements ISubject{
    List<IObserver> observers = new ArrayList<>();
    List<Order> orders = new ArrayList<>();
    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(orders.get(orders.size()-1));
        }
    }
    public void addOrder(Order order){
        orders.add(order);
        notifyObservers();
        System.out.println("Order added successfully!");
    }
}
