import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check palindrome");
            System.out.println("2. Alphabetical order");
            System.out.println("3. Reverse string");
            System.out.println("4. Concatenate");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Check if the string is a palindrome
                    StringBuilder reversed = new StringBuilder(str).reverse();
                    if (str.equalsIgnoreCase(reversed.toString())) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 2:
                    // Sort the words in the string alphabetically
                    String[] words = str.split("\\s+");
                    java.util.Arrays.sort(words);
                    System.out.println("Alphabetical order: " + String.join(" ", words));
                    break;
                case 3:
                    // Reverse the string
                    System.out.println("Reversed string: " + reversed.toString());
                    break;
                case 4:
                    // Concatenate the original string and the reversed string
                    System.out.println("Concatenated string: " + str + reversed.toString());
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
