class Matrix {
    int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void displayMatrix() {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public void displayTranspose() {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public void displayMaxValue() {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int elem : row) {
                if (elem > max) max = elem;
            }
        }
        System.out.println("Maximum Value: " + max);
    }

    public void displayPrincipalDiagonal() {
        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    public void displayNonDiagonalElements() {
        System.out.print("Non-Diagonal Elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j) System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
}

public class MatrixThreads {
    public static void main(String[] args) {
        int[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Matrix matrix = new Matrix(data);

        // Creating and starting multiple threads
        new Thread(matrix::displayMatrix).start();
        new Thread(matrix::displayTranspose).start();
        new Thread(matrix::displayMaxValue).start();
        new Thread(matrix::displayPrincipalDiagonal).start();
        new Thread(matrix::displayNonDiagonalElements).start();
    }
}
