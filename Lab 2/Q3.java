// BitwiseOperations.java
import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int multipliedBy2 = num << 1;
        int dividedBy2 = num >> 1;
        
        System.out.println("Number multiplied by 2: " + multipliedBy2);
        System.out.println("Number divided by 2: " + dividedBy2);
        
        sc.close();
    }
}
