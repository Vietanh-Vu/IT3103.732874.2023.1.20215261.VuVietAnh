package hust.soict.itep.lab01;

import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        // Display a confirmation dialog to ask the user about changing to the first class ticket
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");

        // Determine the user's choice and display the corresponding message
        JOptionPane.showMessageDialog(null, "You've chosen: "
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

        // Exit the program with a status code of 0
        System.exit(0);
    }
}
