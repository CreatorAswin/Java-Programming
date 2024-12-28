import java.util.Scanner;

public class Experiment1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrices
        System.out.println("Enter the number of rows and columns for the matrices:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Declare the matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input elements for the first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Matrix addition
        System.out.println("\nMatrix Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix subtraction
        System.out.println("\nMatrix Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix multiplication (only valid if rows of first matrix = columns of second matrix)
        if (rows == cols) {
            int[][] multiplicationResult = new int[rows][cols];
            System.out.println("\nMatrix Multiplication:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    multiplicationResult[i][j] = 0;
                    for (int k = 0; k < cols; k++) {
                        multiplicationResult[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                    System.out.print(multiplicationResult[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix Multiplication not possible for the given dimensions.");
        }

        // Close the scanner
        scanner.close();
    }
}
