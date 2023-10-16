package Lab01;

import javax.swing.*;

public class SolveLinearEquation {
    public static void main(String[] args) {
        double a;
        double b;
        a = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input a: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));
        b = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input b: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "The equation has infinitely many solutions",
                        "Result " + a + "x" + " + " + b + " = " + "0", JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "The equation has no solution",
                        "Result " + a + "x" + " + " + b + " = " + "0", JOptionPane.INFORMATION_MESSAGE
                );
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(
                    null,
                    "The solution to the equation is x = " + x,
                    "Result " + a + "x" + " + " + b + " = " + "0", JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
