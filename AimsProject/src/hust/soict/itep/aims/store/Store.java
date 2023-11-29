package hust.soict.itep.aims.store;
import hust.soict.itep.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

// Store class represents a media store that manages a collection of Media items.
public class Store {
    // Attribute
    private List<Media> itemsInStore = new ArrayList<Media>();  // List to store available Media items in the store

    // Constructor
    public Store() {
    }

    // Method to add a new media to the store.
    public void addMedia(Media media) {
        // Add media to the store
        itemsInStore.add(media);
        // Notify that media has been added successfully
        System.out.println("Added successfully");
    }

    // Method to remove a media from the store.
    public void removeMedia(Media media) {
        // Search for media in the store
        int indexOfRemoved = itemsInStore.indexOf(media);
        // If the media is not found
        if (indexOfRemoved == -1) {
            System.out.println("Not found media!");
            return;
        }
        // Remove the media
        itemsInStore.remove(indexOfRemoved);
        // Notify that media has been removed successfully
        System.out.println("Removed successfully.");
    }

    // Getters and Setters
    // Getter for the list of items in the store.
    public List<Media> getItemsInStore() {
        return itemsInStore;
    }

    // Setter for the list of items in the store.
    public void setItemsInStore(List<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }

    public void print() {
        System.out.println("***********************LIST ITEMS IN STORE***********************");
        for (Media media : this.itemsInStore) {
            System.out.println(media.toString());
        }
        System.out.println("*****************************************************************");
    }

    public Media findMediaById(int id) {
        for (Media media : itemsInStore) {
            if (media.getId() == id) {
                return media;
            }
        }
        return null;
    }

    public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
}
