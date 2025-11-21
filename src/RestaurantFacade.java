import java.util.Scanner;

public class RestaurantFacade {
    private MenuFactory vegetarianFactory;
    private MenuFactory nonVegetarianFactory;
    private MenuFactory childrenFactory;

    private Manager manager;
    private Scanner scanner;

    public RestaurantFacade() {
        vegetarianFactory = new VegetarianMenuFactory();
        nonVegetarianFactory = new NonVegetarianMenuFactory();
        childrenFactory = new ChildrenMenuFactory();

        manager = new Manager();
        manager.registerObserver(new Kitchen());
        manager.registerObserver(new Waiter());

        scanner = new Scanner(System.in);
    }

    public void makeOrder() {
        System.out.println("\nWelcome to Our Restaurant!");
        System.out.println("==========================");

        Order order = new Order();

        while (true) {
            System.out.println("\n=== Choose Menu Type ===");
            System.out.println("1. Vegetarian Menu");
            System.out.println("2. Non-Vegetarian Menu");
            System.out.println("3. Children Menu");
            System.out.println("4. Finish Order & Pay");
            System.out.print("Enter choice (1-4): ");
            String choice = scanner.nextLine().trim();

            if (choice.equals("4") || choice.equalsIgnoreCase("done")) {
                break;
            }

            MenuFactory factory = null;

            if (choice.equals("1")) {
                factory = vegetarianFactory;
            } else if (choice.equals("2")) {
                factory = nonVegetarianFactory;
            } else if (choice.equals("3")) {
                factory = childrenFactory;
            }

            if (factory == null) {
                System.out.println("Invalid choice! Please enter 1, 2, 3 or 4");
                continue;
            }

            IMenu menu = factory.createMenu();
            menu.displayMenu();
            addItemsFromMenu(order, menu);
        }

        if (order.getSelectedItems().isEmpty()) {
            System.out.println("No items ordered!");
            return;
        }

        while (true) {
            System.out.println("\nChoose payment method:");
            System.out.println("1. Cash");
            System.out.println("2. Credit Card");
            System.out.println("3. Mobile Wallet");
            String payChoice = scanner.nextLine();

            IPayment payment;

            if (payChoice.equals("1")) {
                payment = new CashPayment();
                System.out.println("You selected Cash payment!");
            } else if (payChoice.equals("2")) {
                payment = new CreditCardPayment();
                System.out.println("You selected Credit Card payment!");
            } else if (payChoice.equals("3")) {
                payment = new MobileWalletPayment();
            } else {
                System.out.println("Invalid choice! Please enter 1, 2 or 3");
                continue;
            }

            order.setPayment(payment);
            break;
        }

        manager.addOrder(order);

        order.processPayment();
        order.printBill();

        System.out.println("\nThank you for your visit. We hope to see you again!");
    }

    private void addItemsFromMenu(Order order, IMenu menu) {
        while (true) {
            System.out.print("Enter item name exactly as shown (type 'back' to return, 'done' to finish): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("back") || input.equalsIgnoreCase("done")) {
                break;
            }

            if (input.isEmpty()) {
                System.out.println("Please type: 'item name', 'back', or 'done')!");
                continue;
            }

            IMenuItem item = menu.createMenuItem(input);
            if (item == null) {
                System.out.println("Sorry, no item named '" + input + "' in this menu!");
                System.out.println("Available items:");
                menu.displayMenu();
                continue;
            }

            item = addCustomizations(item);
            order.addItem(item);
            System.out.println("\n" + item.getName() + " added to your order!\n");

            System.out.print("Add another item from this menu? (y/n): ");
            if (!scanner.nextLine().trim().toLowerCase().startsWith("y")) {
                break;
            }
        }
    }

    private IMenuItem addCustomizations(IMenuItem item) {
        System.out.println("Add extras? (y/n)");
        if (!scanner.nextLine().toLowerCase().startsWith("y")) {
            return item;
        }

        System.out.println("Extras: cheese (2.7$), sauces (1.5$), toppings (1.9$)");
        System.out.print("Enter extras separated by comma (or 'none'): ");
        String[] extras = scanner.nextLine().toLowerCase().split(",");

        for (String extra : extras) {
            extra = extra.trim();
            if (extra.contains("cheese")) {
                item = new ExtraCheeseDecorator(item);
            } else if (extra.contains("sauce")) {
                item = new SaucesDecorator(item);
            } else if (extra.contains("topping")) {
                item = new ToppingsDecorator(item);
            }
        }
        return item;
    }
}