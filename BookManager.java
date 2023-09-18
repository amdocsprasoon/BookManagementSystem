import java.util.ArrayList;
import java.util.List;


public class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found!");
            return;
        }

        System.out.println("Books:");
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println();
        }
    }

    public void updateBook(int bookId, String newBookName) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.setBookName(newBookName);
                System.out.println("Book updated successfully!");
                return;
            }
        }

        System.out.println("No book found with ID: " + bookId);
    }

    public void deleteBook(int bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                books.remove(i);
                System.out.println("Book deleted successfully!");
                return;
            }
        }

        System.out.println("No book found with ID: " + bookId);
    }
}
