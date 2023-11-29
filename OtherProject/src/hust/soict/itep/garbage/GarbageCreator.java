package hust.soict.itep.garbage;

import java.util.Random;

public class GarbageCreator {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "Hello World";
        // String concatenation with + operator. creates 1,000,000 objects
        // A lot of garbage is created
        for (int i = 0; i < 1000000; i++) {
            s += "Hello World";
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
