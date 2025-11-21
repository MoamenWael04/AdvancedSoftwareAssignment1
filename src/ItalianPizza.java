class ItalianPizza implements IMenuItem {
    String name;
    double price;
    String description;
    IDescountStrategy strategy;
    public ItalianPizza(){
        this.name = "italian pizza";
        this.price = 10;
        this.description = "italian pizza for veges";
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

