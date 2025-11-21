public class NonVegetarianMenuFactory implements MenuFactory {
    @Override
    public IMenu createMenu() {
        return new NonVegetarianMenu();
    }
}