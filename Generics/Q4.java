class WildcardArguments {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {1.5, 2.5, 3.5};
        String[] stringArray = {"Hello", "World"};

        printElements(intArray);
        printElements(doubleArray);
        printElements(stringArray);
    }

    public static <T> void printElements(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
