import java.util.Scanner;

class SearchArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 2, 1, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value to search: ");
        int searchValue = scanner.nextInt();
        
        System.out.print("The value is found at locations: ");
        boolean found = false;
        int index = 0;
        for (int value : a) {
            if (value == searchValue) {
                System.out.print("a[" + index + "] ");
                found = true;
            }
            index++;
        }
        
        if (!found) {
            System.out.print("Value not found in the array.");
        }
    }
}
