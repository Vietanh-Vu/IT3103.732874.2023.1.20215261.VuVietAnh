package Lab02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<DigitalVideoDisc> itemsInStore;

    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("DVD added to the store: " + dvd.getTitle());
    }

    // Method to remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("DVD removed from the store: " + dvd.getTitle());
        } else {
            System.out.println("DVD not found in the store: " + dvd.getTitle());
        }
    }

    // Getter method to retrieve the items in the store
    public List<DigitalVideoDisc> getItemsInStore() {
        return itemsInStore;
    }
}
