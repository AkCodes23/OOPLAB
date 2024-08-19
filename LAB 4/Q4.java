import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first matrix
        System.out.print("Enter the number of rows and columns for the first matrix: ");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        int[][] matrixA = new int[rowsA][colsA];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input for the second matrix
        System.out.print("Enter the number of rows and columns for the second matrix: ");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();
        int[][] matrixB = new int[rowsB][colsB];

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        if (rowsA == rowsB && colsA == colsB) {
            int[][] sumMatrix = new int[rowsA][colsA];
            System.out.println("Sum of matrices:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                    System.out.print(sumMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix addition not possible. Dimensions must be the same.");
        }

        // Matrix Multiplication
        if (colsA == rowsB) {
            int[][] productMatrix = new int[rowsA][colsB];
            System.out.println("Product of matrices:");

            // Following the given algorithm for multiplication
            for (int i = 0; i < rowsA; i++) { // Loop for each row in matrix A
                for (int j = 0; j < colsB; j++) { // Loop for each column in matrix B
                    productMatrix[i][j] = 0; // Initialize output matrix C to 0
                    for (int k = 0; k < colsA; k++) { // Loop for each column in matrix A
                        productMatrix[i][j] += matrixA[i][k] * matrixB[k][j]; // Multiply A[i,k] with B[k,j] and add to C[i,j]
                    }
                    System.out.print(productMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication not possible. Number of columns in Matrix A must equal number of rows in Matrix B.");
        }
    }
}
