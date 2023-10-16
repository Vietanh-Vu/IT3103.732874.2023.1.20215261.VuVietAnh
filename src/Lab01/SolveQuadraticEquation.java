package Lab01;

import javax.swing.*;

public class SolveQuadraticEquation {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

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
        c = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input c: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            "The equation has infinitely many solutions",
                            "Result " + a + "x^2 + " + b + "x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "The equation has no solution",
                            "Result " + a + "x^2 + " + b + "x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE
                    );
                }
            } else {
                double x = -c / b;
                JOptionPane.showMessageDialog(
                        null,
                        "The solution to the equation is x = " + x,
                        "Result " + a + "x^2 + " + b + "x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE
                );
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                JOptionPane.showMessageDialog(
                        null,
                        "The solutions to the equation are x1 = " + x1 + " and x2 = " + x2,
                        "Result " + a + "x^2 + " + b + "x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE
                );
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(
                        null,
                        "The solution to the equation is x = " + x,
                        "Result " + a + "x^2 + " + b + "x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "The equation has no real solutions",
                        "Result " + a + "x^2 + " + b + "x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }
}
