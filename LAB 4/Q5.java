import java.util.Scanner;

class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int magicSum = 0;
        for (int i = 0; i < n; i++) {
            magicSum += matrix[0][i];
        }

        boolean isMagicSquare = true;

        // Check rows and columns sum
        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != magicSum || colSum != magicSum) {
                isMagicSquare = false;
                break;
            }
        }

        // Check principal diagonal
        int principalDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            principalDiagonalSum += matrix[i][i];
        }
        if (principalDiagonalSum != magicSum) {
            isMagicSquare = false;
        }

        // Check non-principal diagonal
        int nonPrincipalDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            nonPrincipalDiagonalSum += matrix[i][n - 1 - i];
        }
        if (nonPrincipalDiagonalSum != magicSum) {
            isMagicSquare = false;
        }

        if (isMagicSquare) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }
}
