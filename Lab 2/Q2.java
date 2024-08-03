// TypeConversion.java
import java.util.Scanner;

class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an int number: ");
        int intNum = sc.nextInt();
        
        System.out.println("Enter a double number: ");
        double doubleNum = sc.nextDouble();
        
        System.out.println("Enter a char: ");
        char charVal = sc.next().charAt(0);
        
        byte intToByte = (byte) intNum;
        int charToInt = (int) charVal;
        byte doubleToByte = (byte) doubleNum;
        int doubleToInt = (int) doubleNum;
        
        System.out.println("int to byte: " + intToByte);
        System.out.println("char to int: " + charToInt);
        System.out.println("double to byte: " + doubleToByte);
        System.out.println("double to int: " + doubleToInt);
        
        sc.close();
    }
}
