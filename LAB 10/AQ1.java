import java.util.Scanner;

class InputException extends Exception {
    public InputException(String message) {
        super(message);
    }
}

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, number;

        while (true) {
            try {
                System.out.print("Enter a number (-1 to stop): ");
                number = scanner.nextInt();

                if (number == -1) {
                    break;
                } else if (number % 1 != 0) {
                    throw new InputException("Please enter an integer.");
                }

                sum += number;
            } catch (InputException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Sum: " + sum);
    }
}
