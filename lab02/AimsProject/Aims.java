package Lab02;

public class Aims {
    public static void main(String[] args) {
        //Create a new cart
        Cart anOrder = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc[] arrayDvd = {dvd1, dvd2, dvd3};
        if (anOrder.addDigitalVideoDisc(dvd1, dvd2)) {
            System.out.println("Add successful");
            System.out.println();
        }
        anOrder.showCart();

//        if (anOrder.addDigitalVideoDisc(dvd1)) {
//            System.out.println("Add successful");
//        }


//        if (anOrder.addDigitalVideoDisc(dvd2)) {
//            System.out.println("Add successful");
//        }

        if (anOrder.addDigitalVideoDisc(dvd1)) {
            System.out.println("Add successful");
            System.out.println();
        }

        if (anOrder.addDigitalVideoDisc(dvd2)) {
            System.out.println("Add successful");
            System.out.println();
        }

        // print number dvd
        System.out.println("Number of dvd is: " + DigitalVideoDisc.getNbDigitalVideoDiscs());

        // print the id of dvd2
        System.out.println("Id of dvd2 is: " + dvd2.getId());

//        if (anOrder.addDigitalVideoDisc(dvd1)) {
//            System.out.println("Add successful");
//        }


//        if (anOrder.addDigitalVideoDisc(dvd2)) {
//            System.out.println("Add successful");
//        }

//        if (anOrder.addDigitalVideoDisc(dvd3)) {
//            System.out.println("Add successful");
//            System.out.println();
//        }

//        //print total cost of the items in the cart
//        System.out.println("Total Cost is: " + String.format("%.2f", anOrder.calculateTotalCost()));
//        System.out.println();
//
//        // Remove the dvd1
//        if (anOrder.removeDigitalVideoDisc(dvd1)) {
//            System.out.println("Remove successful");
//            System.out.println();
//        }
//
//        anOrder.showCart();
//
//        //print total cost of the items in the cart after remove
//        System.out.println("Total Cost after remove is: " + String.format("%.2f", anOrder.calculateTotalCost()));
    }
}
