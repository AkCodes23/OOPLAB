import java.util.Scanner;

class Q1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length = s.nextInt();
        System.out.println("Enter the breadth:");
        int breadth = s.nextInt();

        int area = length * breadth;
        int circumference = 2 * (length + breadth);

        System.out.println("Area of Rectangle: " + area);
        System.out.println("Circumference of Rectangle: " + circumference);
    }
}
