class SwapElements {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
