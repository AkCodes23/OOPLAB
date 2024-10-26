import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = scanner.nextLine();

        System.out.print("Enter the fourth string: ");
        String str4 = scanner.nextLine();

        System.out.print("Enter the fifth string: ");
        String str5 = scanner.nextLine();

        String concatenatedString = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Concatenated string: " + concatenatedString);

        scanner.close();
    }
}
