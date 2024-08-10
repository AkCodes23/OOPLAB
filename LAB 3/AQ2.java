import java.util.Scanner;

class CombinedSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Evaluate Sin(x) series
        System.out.print("Enter the value of x (in radians) for Sin(x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the number of terms for Sin(x) series: ");
        int nSin = scanner.nextInt();
        
        double sinx = 0;
        for (int i = 0; i < nSin; i++) {
            int sign = (i % 2 == 0) ? 1 : -1;
            sinx += sign * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        
        System.out.println("Sin(" + x + ") = " + sinx);

        // Evaluate Sum = 1 + (1/2)^2 + (1/3)^3 + … series
        System.out.print("Enter the number of terms for the Sum series: ");
        int nSum = scanner.nextInt();
        
        double sum = 0;
        for (int i = 1; i <= nSum; i++) {
            sum += Math.pow(1.0 / i, i);
        }
        
        System.out.println("Sum = " + sum);
    }

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
