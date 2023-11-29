package hust.soict.itep.aims.cart;

import hust.soict.itep.aims.media.DigitalVideoDisc;
import hust.soict.itep.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

// Cart class represents a shopping cart that holds a collection of Media items.
public class Cart {

    // Attribute
    private List<Media> itemsOrdered = new ArrayList<Media>();  // List to store ordered Media items

    // Constructor
    public Cart() {
    }

    // Method to add a new media to the cart.
    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("Added successfully");
    }

    // Method to remove a media from the cart.
    public void removeMedia(Media media) {
        // Search for media
        int indexOfRemoved = itemsOrdered.indexOf(media);

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("Not found media!");
            return;
        }

        // Remove
        itemsOrdered.remove(indexOfRemoved);

        // Notify
        System.out.println("Removed successfully");
    }

    // Method to calculate the total cost of all items in the cart.
    public double totalCost() {
        float cost = 0;
        for (Media media : itemsOrdered) {
            cost += media.getCost();
        }

        return Math.round(cost * 100.0) / 100.0;
    }

    // Method to print the list of ordered items in the cart,
    // including the details of each item and the total cost.
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered) {
            media.print();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************************");
    }

    // Method to search for media in the cart by ID and display the search results.
    public void searchByID(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                found = true;
                media.print();
            }
        }
        if (!found) {
            System.out.println("Not found media!");
        }
    }

    // Method to search for DVDs in the cart by title and print the results.
    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                found = true;
                media.print();
            }
        }
        if (!found) {
            System.out.println("Not found media!");
        }
    }
}