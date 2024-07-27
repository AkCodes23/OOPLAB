//write a program in java to check if entered number is prime numbers
import java.util.Scanner;
class EQ1 {

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i * i <= number; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n+ " is not a prime number.");
        }
    }
}
