class EasternPizza implements IMenuItem{
    String name;
    double price;
    String description;
    IDescountStrategy strategy;

    public EasternPizza(){
        this.name = "Eastern pizza";
        this.price = 12;
        this.description = "Easter pizza for non-veges";
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
