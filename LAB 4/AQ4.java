import java.util.Scanner;

class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merging the arrays
        int[] mergedArray = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = arr2[i];
        }

        // Sorting 
        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = 0; j < mergedArray.length - 1 - i; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    // Swap elements
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }

        
        System.out.println("Merged and sorted array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
