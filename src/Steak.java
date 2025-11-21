class Steak implements  IMenuItem{
    String name;
    double price;
    String description;
    IDescountStrategy strategy;

    public Steak(){
        this.name = "Steak";
        this.price = 21.5;
        this.description = "Steak for non-veges";
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
