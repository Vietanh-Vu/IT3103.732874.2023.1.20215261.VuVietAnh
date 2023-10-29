package Lab01;

import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        // Declare variables to store the two numbers
        double firstNum;
        double secondNum;

        // Prompt the user to input the first number and parse it as a double
        firstNum = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input the first number: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));

        // Prompt the user to input the second number and parse it as a double
        secondNum = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input the second number: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));

        // Calculate the sum, difference, product, and quotient of the two numbers
        double sum = firstNum + secondNum;
        String sumMessage = firstNum + " + " + secondNum + " = " + sum;
        double difference = firstNum - secondNum;
        String difMessage = firstNum + " - " + secondNum + " = " + difference;
        double product = firstNum * secondNum;
        String productMessage = firstNum + " * " + secondNum + " = " + product;
        double quotient = firstNum / secondNum;
        String quotientMessage = firstNum + " / " + secondNum + " = " + quotient;

        // Display a dialog box with the results
        JOptionPane.showMessageDialog(
                null,
                sumMessage + "\n" + difMessage + "\n" + productMessage + "\n" + quotientMessage + "\n",
                "Result", JOptionPane.INFORMATION_MESSAGE
        );

        // Exit the program with a status code of 0
        System.exit(0);
    }
}
