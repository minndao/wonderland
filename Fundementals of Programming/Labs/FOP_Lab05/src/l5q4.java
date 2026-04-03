
package FOP_Lab05.src;

import java.util.Arrays;

import java.util.Random;

 class l5q4 {

    public static void main(String[] args) {
        // 1. Create a matrix and check its values
        int[][] matrix = new int[][]{
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };
        
        printMatrix("Original", matrix);

        
        int[][] copy = copy(matrix);

        // Corner
        copy[0][0] = matrix[2][0];
        copy[2][0] = matrix[2][2];
        copy[2][2] = matrix[0][2];
        copy[0][2] = matrix[0][0];

        // Side
        copy[0][1] = matrix[1][0];
        copy[1][0] = matrix[2][1];
        copy[2][1] = matrix[1][2];
        copy[1][2] = matrix[0][1];

        printMatrix("Hardcoded", copy);

        System.out.println("Reverse Print matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int tmp, n;
        matrix = createMatrix(4, 4);
        printMatrix("Original", matrix);
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix[i].length - 1 - i; j++) {
                n = matrix[i].length;
                tmp = matrix[i][j];
                
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = tmp;
            }
        }
        printMatrix("Pattern Recognition", matrix);

       
    }


    private static int[][] createMatrix(int rows, int cols) {
        Random random = new Random();
        int min = 1, max = 9, range = max - min + 1;

        int[][] matrix = new int[rows][cols];
        for (int[] rowArr : matrix) {
            for (int col = 0; col < rowArr.length; col++) {
                rowArr[col] = random.nextInt(range) + min;
            }
        }
        
        return matrix;
    }

    private static int[][] copy(int[][] src) {
        return Arrays.stream(src).map(int[]::clone).toArray(int[][]::new);
        
    }

    private static void printMatrix(String label, int[][] matrix) {
        System.out.printf("%s matrix:%n", label);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
