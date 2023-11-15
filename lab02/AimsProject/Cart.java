package Lab02;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final int MAX_NUM_ORDER = 20; // Maximum number of orders allowed in the cart
    private static Map<DigitalVideoDisc, Integer> items = new HashMap<>(); // Map to store DVDs and their quantities

    public Cart() {
    }

    // Method to add a DigitalVideoDisc item to the cart
    public static boolean addDigitalVideoDisc(DigitalVideoDisc item) {
        boolean isDone = true;
        if (items.containsKey(item)) {
            items.put(item, items.get(item) + 1); // Increase the quantity if the item already exists
        } else {
            items.put(item, 1); // Add the item to the cart with a quantity of 1
        }
        return isDone;
    }

    // Method to add a list DigitalVideoDisc item to the cart
    public static boolean addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        boolean isDone = true;

        for (DigitalVideoDisc dvd : dvdList) {
            if (items.containsKey(dvd)) {
                items.put(dvd, items.get(dvd) + 1); // Increase the quantity if the item already exists
            } else {
                items.put(dvd, 1); // Add the item to the cart with a quantity of 1
            }
        }

        return isDone;
    }

    // Method to add 2 DigitalVideoDisc item to the cart
    public static boolean addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        boolean isDone = true;

        // Add the first DVD
        if (items.containsKey(dvd1)) {
            items.put(dvd1, items.get(dvd1) + 1); // Increase the quantity if the item already exists
        } else {
            items.put(dvd1, 1); // Add the item to the cart with a quantity of 1
        }

        // Add the second DVD
        if (items.containsKey(dvd2)) {
            items.put(dvd2, items.get(dvd2) + 1); // Increase the quantity if the item already exists
        } else {
            items.put(dvd2, 1); // Add the item to the cart with a quantity of 1
        }

        return isDone;
    }


    // Method to remove a DigitalVideoDisc item from the cart
    public static boolean removeDigitalVideoDisc(DigitalVideoDisc item) {
        boolean isDone = false;
        if (items.remove(item) != null) {
            isDone = true; // If the item is successfully removed, set isDone to true
        }
        return isDone;
    }

    // Method to set the quantity of a DigitalVideoDisc item in the cart
    public static boolean setQty(DigitalVideoDisc item, int qty) {
        boolean isDone = false;
        if (items.put(item, qty) != null) {
            isDone = true; // If the quantity is successfully updated, set isDone to true
        }
        return isDone;
    }

    // Method to calculate the total quantity of items in the cart
    public static int calculateTotalQty() {
        int totalQty = 0;
        for (Map.Entry<DigitalVideoDisc, Integer> entry : items.entrySet()) {
            totalQty += entry.getValue(); // Sum the quantities of all items in the cart
        }
        return totalQty;
    }

    // Method to calculate the total cost of items in the cart
    public static float calculateTotalCost() {
        float totalCost = 0;
        for (Map.Entry<DigitalVideoDisc, Integer> entry : items.entrySet()) {
            totalCost += entry.getKey().getCost() * entry.getValue(); // Calculate the cost for each item and sum them up
        }
        return totalCost;
    }

    // Method to display the contents of the cart
    public static void showCart() {
        for (Map.Entry<DigitalVideoDisc, Integer> entry : items.entrySet()) {
            DigitalVideoDisc dvd = entry.getKey(); // Get the DVD object
            int qty = entry.getValue(); // Get the quantity
            // Display DVD information and quantity
            System.out.println("Title: " + dvd.getTitle());
            System.out.println("Category: " + dvd.getCategory());
            System.out.println("Director: " + dvd.getDirector());
            System.out.println("Length: " + dvd.getLength());
            System.out.println("Cost: " + dvd.getCost());
            System.out.println("Quantity: " + qty);
            System.out.println(); // Print a blank line to separate DVD entries
        }
    }
}
