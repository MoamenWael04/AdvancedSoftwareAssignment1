class CheeseBurger implements IMenuItem{
    String name;
    double price;
    String description;
    IDescountStrategy strategy;

    public CheeseBurger(){
        this.name = "cheese burger";
        this.price = 11.5;
        this.description = "cheese burger for children";
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
