package hust.soict.itep.test.store;

import hust.soict.itep.aims.media.DigitalVideoDisc;
import hust.soict.itep.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a store
        Store store = new Store();

        // Create DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Category 1", "Director 1", 120, 10.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Category 2", "Director 2", 150, 12.99f);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);

        // Display items in the store
        System.out.println("Items in the store:");
        for (DigitalVideoDisc dvd : store.getItemsInStore()) {
            System.out.println(dvd.getTitle());
        }

        // Remove a DVD from the store
        store.removeDVD(dvd1);

        // Display updated items in the store
        System.out.println("Updated items in the store:");
        for (DigitalVideoDisc dvd : store.getItemsInStore()) {
            System.out.println(dvd.getTitle());
        }
    }
}
