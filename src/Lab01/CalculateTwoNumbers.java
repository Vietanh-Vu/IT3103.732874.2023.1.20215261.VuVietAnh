package Lab01;

import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        double firstNum;
        double secondNum;
        firstNum = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input the first number: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));
        secondNum = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input the second number: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));

        double sum = firstNum + secondNum;
        String sumMessage = firstNum + " + " + secondNum + " = " + sum;
        double difference = firstNum - secondNum;
        String difMessage = firstNum + " - " + secondNum + " = " + difference;
        double product = firstNum * secondNum;
        String productMessage = firstNum + " * " + secondNum + " = " + product;
        double quotient = firstNum / secondNum;
        String quotientMessage = firstNum + " / " + secondNum + " = " + quotient;

        JOptionPane.showMessageDialog(
                null,
                sumMessage + "\n" + difMessage + "\n" + productMessage + "\n" + quotientMessage + "\n",
                "Result", JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);
    }
}
