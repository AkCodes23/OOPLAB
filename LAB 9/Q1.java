import java.util.Scanner;

class CountStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int charCount = str.length();
        String[] words = str.split("\\s+");
        int wordCount = words.length;
        String[] lines = str.split("\n");
        int lineCount = lines.length;

        int vowelCount = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
        System.out.println("Vowels: " + vowelCount);
    }
}
