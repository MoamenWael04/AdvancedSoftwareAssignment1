class EasternPizza implements IMenuItem{
    String name;
    double price;
    String description;
    IDescountStrategy strategy;

    public EasternPizza(){
        this.name = "Eastern Pizza";
        this.price = 12;
        this.description = "Easter Pizza for Non-Vegetarians!";
        this.strategy = new PizzaDiscount();
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
    @Override
    public double getFinalPrice() {
        return strategy.applyDiscount(price);
    }
}
