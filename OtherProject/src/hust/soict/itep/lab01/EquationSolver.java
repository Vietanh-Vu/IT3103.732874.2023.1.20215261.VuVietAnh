package hust.soict.itep.lab01;

import javax.swing.*;

public class EquationSolver {
    public static void main(String[] args) {
        // Define an array of options for equation solving
        String[] options = {"Solve Linear Equation", "Solve System of Linear Equations", "Solve Quadratic Equation"};

        // Display an option dialog to let the user choose an equation type
        int choice = JOptionPane.showOptionDialog(
                null,
                "Select an equation to solve:",
                "Equation Solver",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);

        // Use a switch statement to perform the chosen equation solving task
        switch (choice) {
            case 0:
                solveLinearEquation();
                break;
            case 1:
                solveSystemOfLinearEquations();
                break;
            case 2:
                solveQuadraticEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to solve a linear equation
    public static void solveLinearEquation() {
        // Prompt the user to input coefficients a and b
        double a = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input a: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));
        double b = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input b: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));

        // Check and display the solution or lack of solution
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

    // Method to solve a system of linear equations
    public static void solveSystemOfLinearEquations() {
        // Prompt the user to input coefficients for a system of linear equations
        String[] labels = {"a11", "a12", "b1", "a21", "a22", "b2"};
        double[] coefficients = new double[6];

        for (int i = 0; i < labels.length; i++) {
            coefficients[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Input " + labels[i] + ": ", "Input data", JOptionPane.INFORMATION_MESSAGE));
        }

        // Extract coefficients for the system of linear equations
        double a11 = coefficients[0];
        double a12 = coefficients[1];
        double b1 = coefficients[2];
        double a21 = coefficients[3];
        double a22 = coefficients[4];
        double b2 = coefficients[5];

        // Calculate the determinant of the system
        double determinant = a11 * a22 - a12 * a21;

        // Check and display the solutions or lack of solutions
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

    // Method to solve a quadratic equation
    public static void solveQuadraticEquation() {
        // Prompt the user to input coefficients for a quadratic equation
        double a = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input a: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));
        double b = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input b: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));
        double c = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Input c: ",
                "Input data",
                JOptionPane.INFORMATION_MESSAGE
        ));

        // Check and display the solutions or lack of solutions for the quadratic equation
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
                        "Result " + a + "x^2 + " + b + "x + " + c + " = 0" , JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }
}
