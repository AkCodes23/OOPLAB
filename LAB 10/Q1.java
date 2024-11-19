import java.util.Scanner;

class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        try {
            while (!validInput) {
                System.out.print("Enter a valid integer: ");
                String input = scanner.nextLine();

                try {
                    number = Integer.parseInt(input);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
            }

            System.out.println("You entered: " + number);
        } finally {
            scanner.close();
        }
    }
}
