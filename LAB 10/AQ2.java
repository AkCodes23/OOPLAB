public class NegativeArraySize {
    public static void main(String[] args) {
        int size;

        try {
            System.out.print("Enter the size of the array: ");
            Scanner scanner = new Scanner(System.in);
            size = scanner.nextInt();

            if (size < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative.");
            }

            int[] array = new int[size];
            // ... (use the array)
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}
