import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "fig"};
        Arrays.sort(strings);
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
