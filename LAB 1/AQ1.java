import java.util.Scanner;

class AQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
