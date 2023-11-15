package Lab02;

import java.util.Random;

public class NoGarbage {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "Hello World";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < 1000000; i++) {
            sb.append("Hello World");
        }
        System.out.println(System.currentTimeMillis() - start);
    }

}
