package Lab01;

import javax.swing.*;

public class SolveSystemOfLinearEquations {
    public static void main(String[] args) {
        String[] labels = {"a11", "a12", "b1", "a21", "a22", "b2"};
        double[] coefficients = new double[6];

        for (int i = 0; i < labels.length; i++) {
            coefficients[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Input " + labels[i] + ": ", "Input data", JOptionPane.INFORMATION_MESSAGE));
        }

        double a11 = coefficients[0];
        double a12 = coefficients[1];
        double b1 = coefficients[2];
        double a21 = coefficients[3];
        double a22 = coefficients[4];
        double b2 = coefficients[5];

        double determinant = a11 * a22 - a12 * a21;

        if (determinant == 0) {
            if (a11 / a21 == b1 / b2) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solutions.", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            JOptionPane.showMessageDialog(null, "(x1, x2): " + x1 + ", " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
