class ChickenNuggets implements IMenuItem{
    String name;
    double price;
    String description;
    IDescountStrategy strategy;

    public ChickenNuggets(){
        this.name = "chicken nuggets";
        this.price = 8.4;
        this.description = "chicken nuggets for children";
        this.strategy = new MeatDescount();

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
