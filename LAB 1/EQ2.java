//simple interest
import java.util.Scanner;

class EQ2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p,r,t,si;
    System.out.print("Enter an Principal Amount: ");
         p = sc.nextInt();
    System.out.print("Enter an rate: ");
         r = sc.nextInt();
    System.out.print("Enter an time in years: ");
         t = sc.nextInt();

    si=((p*r*t)/100);
    System.out.println("Simple Interest is :"+si);
 }}