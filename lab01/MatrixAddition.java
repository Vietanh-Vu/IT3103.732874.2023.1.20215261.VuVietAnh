package Lab01;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns for the matrices
        System.out.print("Enter the number of rows of the matrix: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int columns = input.nextInt();

        // Create two matrices with the specified number of rows and columns
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        // Prompt the user to enter the elements for the first and second matrices
        System.out.println("Enter the first matrix:");
        inputMatrix(matrix1, input);

        System.out.println("Enter the second matrix:");
        inputMatrix(matrix2, input);

        // Create a matrix to store the sum of the two input matrices
        int[][] sumMatrix = new int[rows][columns];

        // Perform matrix addition by adding corresponding elements from the two input matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // Print the first matrix, the second matrix, and the sum of the two matrices
        System.out.println("First matrix:");
        printMatrix(matrix1);

        System.out.println("Second matrix:");
        printMatrix(matrix2);

        System.out.println("Sum of the two matrices:");
        printMatrix(sumMatrix);

        // Close the input scanner
        input.close();
    }

    // Method to input matrix elements
    public static void inputMatrix(int[][] matrix, Scanner input) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

