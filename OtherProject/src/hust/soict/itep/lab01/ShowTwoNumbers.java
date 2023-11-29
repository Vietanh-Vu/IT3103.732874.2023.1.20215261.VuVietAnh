package hust.soict.itep.lab01;

// Example 5: ShowTwoNumbers.java

import javax.swing.*;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        // Declare variables to store user input and notification
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        // Display an input dialog to get the first number from the user
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        // Add the first number to the notification string
        strNotification += strNum1 + " and ";

        // Display another input dialog to get the second number from the user
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        // Add the second number to the notification string
        strNotification += strNum2;

        // Display a dialog box with the combined notification
        JOptionPane.showMessageDialog(null, strNotification,
                "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        // Exit the program with a status code of 0
        System.exit(0);
    }
}
