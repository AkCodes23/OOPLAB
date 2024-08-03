import java.util.Scanner;

 class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the ending number (m): ");
        int m = sc.nextInt();

        System.out.println("Prime numbers between " + n + " and " + m + " are:");
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
