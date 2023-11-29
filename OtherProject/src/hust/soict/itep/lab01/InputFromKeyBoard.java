package hust.soict.itep.lab01;

import java.util.Scanner;

public class InputFromKeyBoard {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for their name and read it as a string
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();

        // Prompt the user for their age and read it as an integer
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();

        // Prompt the user for their height in meters and read it as a double
        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();

        // Display a message with the user's name, age, and height
        System.out.println("Mrs/Ms." + strName + "," + iAge + " years old. " +
                "Your height is " + dHeight + " m.");
    }
}
