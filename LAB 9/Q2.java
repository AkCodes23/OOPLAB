import java.util.Scanner;

class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a word to replace: ");
        String wordToReplace = sc.nextLine();

        String replacedStr = str.replaceAll(wordToReplace, wordToReplace.replaceAll(".", "*"));
        System.out.println("Replaced string: " + replacedStr);
    }
}
