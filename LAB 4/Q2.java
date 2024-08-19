import java.util.Scanner;

class PrincipalDiagonal {
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

        int sum = 0;
        System.out.print("Principal diagonal elements: ");
        for (int i = 0; i < n; i++) {
            int element = matrix[i][i];
            System.out.print(element + " ");
            sum += element;
        }
        System.out.println("\nSum of principal diagonal elements: " + sum);
    }
}
