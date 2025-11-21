class CezarSalad implements IMenuItem{
    String name;
    double price;
    String description;
    IDescountStrategy strategy;

    public CezarSalad(){
        this.name = "cezar salad";
        this.price = 5.7;
        this.description = "cezar salad for veges";
        this.strategy = new SaladDescount();

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
