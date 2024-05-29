package SchoolWork3;

import java.util.Scanner;

public class MatrixMultiplication {
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("Incompatible dimensions for matrix multiplication.");
        }

        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix A (3x3):");
        double[][] a = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        System.out.println("Enter matrix B (3x3):");
        double[][] b = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = input.nextDouble();
            }
        }
        try {
            double[][] product = multiplyMatrix(a, b);
            System.out.println("The product of matrix A and matrix B is:");
            for (double[] row : product) {
                for (double element : row) {
                    System.out.printf("%.1f\t", element);
                }
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}