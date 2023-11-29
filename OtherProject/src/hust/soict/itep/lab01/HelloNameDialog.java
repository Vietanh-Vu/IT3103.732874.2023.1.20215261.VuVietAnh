package hust.soict.itep.lab01;

import javax.swing.*;

public class HelloNameDialog {
    public static void main(String[] args) {
        // Declare a variable to store user input
        String result;

        // Display an input dialog to get the user's name
        result = JOptionPane.showInputDialog("Please enter your name:");

        // Display a dialog box with a personalized greeting
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");

        // Exit the program with a status code of 0
        System.exit(0);
    }
}
