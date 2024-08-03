// AQ1.java
import java.util.Scanner;

class AQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for a: ");
        int a = sc.nextInt();

        System.out.println("Enter value for b: ");
        int b = sc.nextInt();

        int resultA = (a << 2) + (b >> 2);
        boolean resultB = (b > 0);
        int resultC = (a + b * 100) / 10;
        int resultD = a & b;

        System.out.println("Result of (a << 2) + (b >> 2): " + resultA);
        System.out.println("Result of (b > 0): " + resultB);
        System.out.println("Result of (a + b * 100) / 10: " + resultC);
        System.out.println("Result of (a & b): " + resultD);

        sc.close();
    }
}
