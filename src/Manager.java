import java.util.ArrayList;
import java.util.List;

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
        System.out.println("\nOrder Completed Successfully!");
    }
}

