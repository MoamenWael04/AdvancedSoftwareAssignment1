# Restaurant Ordering System – README

## 📌 Overview
This project is a modular restaurant ordering system designed using several OOP design patterns, including:
- **Strategy Pattern** (dynamic discounts)
- **Decorator Pattern** (extras/customizations)
- **Factory Pattern** (menu and item creation)
- **Facade Pattern** (ordering workflow)
- **Observer Pattern** (notifying kitchen & waiter)

The system allows customers to:
- Select menu type
- Choose items
- Add extras
- Apply different discount strategies
- Pay using different payment methods
- Generate a bill

---

## 🚀 How to Run the Project
### **1. Requirements**
- Java JDK 8 or higher
- Any IDE (IntelliJ, Eclipse, VS Code) or CLI

### **2. Compile the Code**
If using command line:
```sh
javac *.java
```

### **3. Run the System**
```sh
java Main
```
(Assuming you have a `Main` class that creates and runs the `RestaurantFacade`)

Example:
```java
public class Main {
    public static void main(String[] args) {
        RestaurantFacade facade = new RestaurantFacade();
        facade.makeOrder();
    }
}
```

---

## 📦 Project Structure
```
/Strategy        → Discount behavior logic
/Decorator       → Extras such as cheese, sauces, toppings
/Factory         → Menu & item creation
/Observer        → Manager, Kitchen, Waiter
/Facade          → RestaurantFacade (main workflow)
/MenuItems       → ItalianPizza, CezarSalad, ChildrenMeal...
```

---

## 🧠 How Discounts Work (Strategy Pattern)
Each item contains a `Discount` context:
```java
Discount discount = new Discount(new SaladDiscount());
```
You can dynamically change the discount later:
```java
item.setDiscountStrategy(new BlackFridayDiscount());
```

### **Available Example Discount Strategies**
| Strategy | Description |
|----------|-------------|
| `SaladDiscount` | 15% off for salads |
| `NoDiscount` | No discount |
| `HolidayDiscount` | Special seasonal discount |
| `BlackFridayDiscount` | Large discount for offers day |

---

## 🍕 How Extras Work (Decorator Pattern)
Extras wrap the item dynamically:
```java
item = new ExtraCheeseDecorator(item);
item = new SaucesDecorator(item);
```
Each decorator increases:
- Final price
- Description

---

## 📋 Example Test Cases

### **Test Case 1 — Simple Order Without Extras**
```
Menu: Vegetarian
Item: Cezar Salad (5.7$)
Discount: SaladDiscount → final price = 4.845$
```

### **Test Case 2 — Pizza with Cheese and Toppings**
```
Menu: Vegetarian
Item: Italian Pizza → base price e.g. 12.0$
Extras: Cheese (+2.7), Toppings (+1.9)
Final price = 16.6$
```

### **Test Case 3 — Applying Different Discounts**
```java
IMenuItem item = new CezarSalad();
item.setDiscountStrategy(new NoDiscount());
```
Expected final price:
```
5.7$
```

Then:
```java
item.setDiscountStrategy(new HolidayDiscount());
```
Expected final price (example):
```
5.13$  (10% discount)
```

---

## 🧪 Discount Scenarios to Try
You can test these by changing the strategy at runtime:

### ✔ Scenario A: No Discount
```
setDiscountStrategy(new NoDiscount())
```

### ✔ Scenario B: Black Friday Discount
```
setDiscountStrategy(new BlackFridayDiscount())
```

### ✔ Scenario C: Seasonal Holiday Discount
```
setDiscountStrategy(new HolidayDiscount())
```

### ✔ Scenario D: Custom Discount (User-Defined)
You can easily create a new strategy:
```java
public class CustomDiscount implements IDiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.70; // 30% off
    }
}
```

---

## 🎉 Final Notes
This architecture is built for scalability:
- Add new menus with zero changes to the Facade
- Add new discounts without touching item classes
- Add new extras via new Decorators
- Add new observers (Delivery, Notification System...)

The project follows Clean OOP, SOLID, and well-known design patterns.

---

If you want, I can also generate:
✔ A UML Class Diagram
✔ A Sequence Diagram for makeOrder()
✔ A PDF version of all documentation

