import java.util.Scanner;

class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Compare strings");
            System.out.println("2. Convert case");
            System.out.println("3. Check substring");
            System.out.println("4. Replace substring");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Compare the strings
                    if (str1.equals(str2)) {
                        System.out.println("The strings are equal.");
                    } else {
                        System.out.println("The strings are not equal.");
                    }
                    break;
                case 2:
                    // Convert case
                    str1 = str1.toUpperCase();
                    str2 = str2.toLowerCase();
                    System.out.println("Converted strings: " + str1 + " and " + str2);
                    break;
                case 3:
                    // Check if one string is a substring of the other
                    if (str1.contains(str2)) {
                        System.out.println(str2 + " is a substring of " + str1);
                    } else if (str2.contains(str1)) {
                        System.out.println(str1 + " is a substring of " + str2);
                    } else {
                        System.out.println("Neither string is a substring of the other.");
                    }
                    break;
                case 4:
                    // Replace a substring with "Hello"
                    if (str1.contains(str2)) {
                        str1 = str1.replace(str2, "Hello");
                        System.out.println("Replaced string: " + str1);
                    } else {
                        System.out.println("Substring not found.");
                    }
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
