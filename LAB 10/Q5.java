import java.util.Scanner;

class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of rows: ");
            int rows = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the number of columns: ");
            int columns = Integer.parseInt(scanner.nextLine());

            if (rows == columns) {
                System.out.println("The matrix is a square matrix.");
            } else {
                System.out.println("The matrix is not a square matrix.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values for rows and columns.");
        } finally {
            scanner.close();
        }
    }
}

