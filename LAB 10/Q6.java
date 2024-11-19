import java.util.Scanner;

class NegativeRootCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        if (number < 0) {
            System.out.println("Square root of a negative number is imaginary.");
        } else {
            double root = Math.sqrt(number);
            System.out.println("Square root: " + root);
        }
    }
}
