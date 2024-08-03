// LeapYearCheck.java
import java.util.Scanner;

class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeapYear;

        if (year % 4 != 0) {
            isLeapYear = false;
        } else if (year % 100 != 0) {
            isLeapYear = true;
        } else if (year % 400 != 0) {
            isLeapYear = false;
        } else {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
