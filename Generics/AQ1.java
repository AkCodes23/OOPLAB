class PrintArrays {
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        String[] stringArray = {"Hello", "World", "Java", "Programming"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
    }
}
