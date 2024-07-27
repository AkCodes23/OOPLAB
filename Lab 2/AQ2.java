// AQ2.java
import java.util.Scanner;

public class AQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        int largest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        int smallest = num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);

        sc.close();
    }
}
