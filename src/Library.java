import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // Method to remove a book by ISBN if tenure is expired
    public void removeBook(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn) && book.getTenure() <= 0) {
                iterator.remove();
                System.out.println("Book removed: " + book);
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found or tenure not expired.");
    }

    // Method to update the tenure of all books
    public void updateTenure() {
        for (Book book : books) {
            book.setTenure(book.getTenure() - 1);
        }
        System.out.println("Updated tenure for all books.");
    }

    // Method to print all books
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
