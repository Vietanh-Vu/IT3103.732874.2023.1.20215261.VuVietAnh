package hust.soict.itep.lab02.AimsProject;

import Lab02.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        //Create a new cart
        Cart anOrder = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc[] arrayDvd = {dvd1, dvd2, dvd3};
        if (anOrder.addDigitalVideoDisc(arrayDvd)) {
            System.out.println("Add successful");
            System.out.println();
        }

        // Print the content in Cart
        anOrder.printCart();

        // Search DVD by Id
        anOrder.searchDVDById(2);

        // Search DVD by Title
        anOrder.searchDVDByTitle("Aladin");
    }
}
