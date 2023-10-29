package Lab01;

import java.util.Scanner;

public class TriangleStars {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();

        // Loop to build and display a right-angled triangle made of stars
        for (int i = 1; i <= n; i++) {
            // Loop to print leading spaces to align the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Loop to print the stars in each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
