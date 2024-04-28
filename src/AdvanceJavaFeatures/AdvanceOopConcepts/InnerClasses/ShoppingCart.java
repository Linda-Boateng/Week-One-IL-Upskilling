package AdvanceJavaFeatures.AdvanceOopConcepts.InnerClasses;

import java.util.ArrayList;
import java.util.List;

/*
Inner classes are used to implement complex logics in which classes are tightly
coupled, i.e. classes depend closely on each other to function.
 */

public class ShoppingCart {
    private final String customerName;

    public ShoppingCart(String customerName) {
        this.customerName = customerName;
    }

    public void displayCartDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("--- Cart Items ---");
        ItemIterator iterator = new ItemIterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }

    public static class ItemIterator {
        private final List<Item> items;
        private int currentIndex;

        public ItemIterator() {
            items = new ArrayList<>();
            currentIndex = 0;
            // Simulating some sample items added to the cart
            items.add(new Item("Shirt", 25.99));
            items.add(new Item("Jeans", 39.99));
            items.add(new Item("Shoes", 59.99));
        }

        public boolean hasNext() {
            return currentIndex < items.size();
        }

        public Item next() {
            Item item = items.get(currentIndex);
            currentIndex++;
            return item;
        }
    }

    public static class Item {
        private final String name;
        private final double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("John Doe");
        cart.displayCartDetails();
    }
}