public interface IMenuItem {
    String getName();
    double getPrice();
    String getDescription();

}


// veges menu
class ItalianPizza implements IMenuItem {
    String name;
    double price;
    String description;
    public ItalianPizza(){
        this.name = "italian pizza";
        this.price = 10;
        this.description = "italian pizza for veges";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
class CezarSalad implements IMenuItem{
    String name;
    double price;
    String description;
    public CezarSalad(){
        this.name = "cezar salad";
        this.price = 5.7;
        this.description = "cezar salad for veges";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }
}


// non-veges menu
class EasternPizza implements IMenuItem{
    String name;
    double price;
    String description;
    public EasternPizza(){
        this.name = "Eastern pizza";
        this.price = 12;
        this.description = "Easter pizza for non-veges";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
class Steak implements  IMenuItem{
    String name;
    double price;
    String description;
    public Steak(){
        this.name = "Steak";
        this.price = 21.5;
        this.description = "Steak for non-veges";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }

}


//for children
class ChickenNuggets implements IMenuItem{
    String name;
    double price;
    String description;
    public ChickenNuggets(){
        this.name = "chicken nuggets";
        this.price = 8.4;
        this.description = "chicken nuggets for children";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
class CheeseBurger implements IMenuItem{
    String name;
    double price;
    String description;
    public CheeseBurger(){
        this.name = "cheese burger";
        this.price = 11.5;
        this.description = "cheese burger for children";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }
}