// Calculator.java
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char anotherCalculation;

        do {
            System.out.println("Enter first number, operator, second number: ");
            double num1 = sc.nextDouble();
            char operator = sc.next().charAt(0);
            double num2 = sc.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;
            }

            System.out.println("Answer = " + result);
            System.out.println("Do another (y/n)? ");
            anotherCalculation = sc.next().charAt(0);
        } while (anotherCalculation == 'y');

        sc.close();
    }
}
