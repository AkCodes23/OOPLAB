import java.util.Scanner;

class Book {
    String title;
    String author;
    int edition;

    Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Edition: " + edition);
    }
}

class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[6];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            String title = sc.nextLine();
            String author = sc.nextLine();
            int edition = sc.nextInt();
            sc.nextLine();

            books[i] = new Book(title, author, edition);
        }

        System.out.print("Enter author name to search: ");
        String authorName = sc.nextLine();

        System.out.println("Books by " + authorName + ":");
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(authorName)) {
                book.display();
            }
        }
    }
}
