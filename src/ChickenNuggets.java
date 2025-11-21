class ChickenNuggets implements IMenuItem{
    String name;
    double price;
    String description;
    IDescountStrategy strategy;

    public ChickenNuggets(){
        this.name = "Chicken Nuggets";
        this.price = 8.4;
        this.description = "Chicken Nuggets for Children!";
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
