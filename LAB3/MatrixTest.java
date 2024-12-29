package matrixtest;
import java.util.Scanner;

public class MatrixTest {
    
    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to subtract a scalar from every element of a matrix
    public static int[][] subtractScalar(int[][] matrix, int scalar) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[i][j] - scalar;
            }
        }
        return result;
    }

    // Method to raise a matrix to the power of an exponent
    public static int[][] matrixPower(int[][] matrix, int power) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        // Initialize result as identity matrix
        for (int i = 0; i < n; i++) {
            result[i][i] = 1;
        }

        // Multiply the matrix with itself power times
        for (int p = 0; p < power; p++) {
            result = multiplyMatrices(result, matrix);
        }

        return result;
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initialize Mat_1 and Mat_2
        int[][] Mat_1 = new int[3][3];
        int[][] Mat_2 = new int[3][3];

        // Taking input for Mat_1
        System.out.println("Enter values for Mat_1 (3x3 matrix): ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mat_1[i][j] = sc.nextInt();
            }
        }

        // Taking input for Mat_2
        System.out.println("Enter values for Mat_2 (3x3 matrix): ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mat_2[i][j] = sc.nextInt();
            }
        }

        // Solve equations
        System.out.println("Solving (Mat_1*Mat_1*Mat_1) + (Mat_2*Mat_2):");
        int[][] result1 = addMatrices(matrixPower(Mat_1, 3), matrixPower(Mat_2, 2));
        printMatrix(result1);

        System.out.println("Solving (Mat_2 - 3)*(Mat_2 - 3):");
        int[][] result2 = matrixPower(subtractScalar(Mat_2, 3), 2);
        printMatrix(result2);

        System.out.println("Solving (Mat_2*Mat_2*Mat_2*Mat_2*Mat_2) - (Mat_1 - 2):");
        int[][] result3 = subtractMatrices(matrixPower(Mat_2, 5), subtractScalar(Mat_1, 2));
        printMatrix(result3);

        sc.close();
    }
}

