class NumberPatternForEach {
    public static void main(String[] args) {
        // Array to store the numbers
        int[] numbers = {1, 2, 3, 4, 5};

        // For-each loop to print the pattern
        for (int number : numbers) {
            for (int i = 0; i < number; i++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
