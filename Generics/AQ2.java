class FindLargest {
    public static <T extends Comparable<T>> T findLargest(T a, T b, T c) {
        T largest = a;
        if (b.compareTo(largest) > 0) {
            largest = b;
        }
        if (c.compareTo(largest) > 0) {
            largest = c;
        }
        return largest;
    }

    public static void main(String[] args) {
        Integer largestInt = findLargest(10, 20, 30);
        Double largestDouble = findLargest(1.5, 2.5, 3.5);
        String largestString = findLargest("apple", "banana", "cherry");

        System.out.println("Largest integer: " + largestInt);
        System.out.println("Largest double: " + largestDouble);
        System.out.println("Largest string: " + largestString);
    }
}
