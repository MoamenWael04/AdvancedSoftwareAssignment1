# 🚗 Restaurant Ordering & Billing System –  Readme
---

## 📌 Overview
Design and implement a modular and extensible Restaurant Ordering & Billing System that enables customers to browse menus, customize meals, place orders, process payments, and generate bills.
The system must adhere to SOLID design principles and apply all the required object-oriented design patterns. 
The goal is to demonstrate clean architecture,flexibility for future extensions, and maintainability through proper design abstraction.
The system should simulate the complete workflow of a restaurant, from ordering to billing. The following sections describe the required components

---

## 🧰 Sample Example
```text
Welcome to Our Restaurant!
==========================

=== Choose Menu Type ===
1. Vegetarian Menu
2. Non-Vegetarian Menu
3. Children Menu
4. Finish Order & Pay
Enter choice (1-4): 1

=== Vegetarians Menu ===
-Item: Italian Pizza - Price: 10.0$
  Italian Pizza for Vegetarians!

-Item: Cezar Salad - Price: 5.7$
  Cezar Salad for Vegetarians!

Enter item name exactly as shown (type 'back' to return, 'done' to finish): Italian Pizza
Add extras? (y/n)
y
Extras: cheese (2.7$), sauces (1.5$), toppings (1.9$)
Enter extras separated by comma (or 'none'): cheese

Italian Pizza with extra cheese added to your order!

Add another item from this menu? (y/n): n

=== Choose Menu Type ===
1. Vegetarian Menu
2. Non-Vegetarian Menu
3. Children Menu
4. Finish Order & Pay
Enter choice (1-4): 1

=== Vegetarians Menu ===
-Item: Italian Pizza - Price: 10.0$
  Italian Pizza for Vegetarians!

-Item: Cezar Salad - Price: 5.7$
  Cezar Salad for Vegetarians!

Enter item name exactly as shown (type 'back' to return, 'done' to finish): Cezar Salad
Add extras? (y/n)
n

Cezar Salad added to your order!

Add another item from this menu? (y/n): n

=== Choose Menu Type ===
1. Vegetarian Menu
2. Non-Vegetarian Menu
3. Children Menu
4. Finish Order & Pay
Enter choice (1-4): 2

=== Non-Vegetarians Menu ===
-Item: Eastern Pizza - Price: 12.0$
  Easter Pizza for Non-Vegetarians!

-Item: Steak - Price: 21.5$
  Steak for Non-Vegetarians

Enter item name exactly as shown (type 'back' to return, 'done' to finish): Eastern Pizza
Add extras? (y/n)
y
Extras: cheese (2.7$), sauces (1.5$), toppings (1.9$)
Enter extras separated by comma (or 'none'): sauces

Eastern Pizza with sauces added to your order!

Add another item from this menu? (y/n): y
Enter item name exactly as shown (type 'back' to return, 'done' to finish): Steak
Add extras? (y/n)
y
Extras: cheese (2.7$), sauces (1.5$), toppings (1.9$)
Enter extras separated by comma (or 'none'): toppings

Steak with toppings added to your order!

Add another item from this menu? (y/n): n

=== Choose Menu Type ===
1. Vegetarian Menu
2. Non-Vegetarian Menu
3. Children Menu
4. Finish Order & Pay
Enter choice (1-4): 3

=== Children Menu ===
-Item: Chicken Nuggets - Price: 8.4$
  Chicken Nuggets for Children!

-Item: Cheese Burger - Price: 11.5$
  Cheese Burger for Children!

Enter item name exactly as shown (type 'back' to return, 'done' to finish): Chicken Nuggets
Add extras? (y/n)
n

Chicken Nuggets added to your order!

Add another item from this menu? (y/n): y
Enter item name exactly as shown (type 'back' to return, 'done' to finish): Cheese Burger
Add extras? (y/n)
n

Cheese Burger added to your order!

Add another item from this menu? (y/n): n

=== Choose Menu Type ===
1. Vegetarian Menu
2. Non-Vegetarian Menu
3. Children Menu
4. Finish Order & Pay
Enter choice (1-4): 4

Choose payment method:
1. Cash
2. Credit Card
3. Mobile Wallet
1
You selected Cash payment!

*** Kitchen received New Order(s) ***
-----------------------------------
 + Italian Pizza with extra cheese
 + Cezar Salad
 + Eastern Pizza with sauces
 + Steak with toppings
 + Chicken Nuggets
 + Cheese Burger

*** Waiter received New Order(s) ***
------------------------------------
 + Italian Pizza with extra cheese
 + Cezar Salad
 + Eastern Pizza with sauces
 + Steak with toppings
 + Chicken Nuggets
 + Cheese Burger
Waiter is going to receive 70.075$  (after discount) for the Order!

Order Completed Successfully!
The customer paid with Cash: 70.075$

========== FINAL BILL ==========
Item: Italian Pizza with extra cheese - Price (after discount): 11.7
Item: Cezar Salad - Price (after discount): 4.845
Item: Eastern Pizza with sauces - Price (after discount): 12.3
Item: Steak with toppings - Price (after discount): 22.325
Item: Chicken Nuggets - Price (after discount): 7.9799999999999995
Item: Cheese Burger - Price (after discount): 10.924999999999999
--------------------------------
TOTAL: 70.075
================================

Thank you for your visit. We hope to see you again!
```
## 🧑‍💻 **Developed For**
Advanced Software Engineering 2025 - 
Faculty of Computers and Artificial Intelligence - 
Cairo University

---
## 📅 **Last Updated: November 22, 2025**
