class EvenNumberException extends Exception {
    public EvenNumberException(String message) {
        super(message);
    }
}

public class CheckEvenNumber {
    public static void main(String[] args) {
        int number;

        try {
            System.out.print("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

            if (number % 2 == 0) {
                throw new EvenNumberException("Number is even.");
            }

            // ... (continue with the number)
        } catch (EvenNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
