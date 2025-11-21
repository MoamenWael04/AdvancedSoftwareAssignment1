public class VegetarianMenuFactory implements MenuFactory {
    @Override
    public IMenu createMenu() {
        return new VegetarianMenu();
    }
}