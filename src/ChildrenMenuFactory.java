// ChildrenMenuFactory.java
public class ChildrenMenuFactory implements MenuFactory {
    @Override
    public IMenu createMenu() {
        return new ChildrenMenu();
    }
}