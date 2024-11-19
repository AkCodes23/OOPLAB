class ArrayOverflowExample {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            for (int i = 0; i <= array.length; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
}
