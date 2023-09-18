import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager bookManager = new BookManager();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter Book Name: ");
                    String bookName = scanner.nextLine();
                    Book newBook = new Book(bookId, bookName);
                    bookManager.addBook(newBook);
                    break;
                case 2:
                    bookManager.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to update: ");
                    int updateBookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter new Book Name: ");
                    String newBookName = scanner.nextLine();
                    bookManager.updateBook(updateBookId, newBookName);
                    break;
                case 4:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteBookId = scanner.nextInt();
                    bookManager.deleteBook(deleteBookId);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
            System.out.println();
        }
    }
}
