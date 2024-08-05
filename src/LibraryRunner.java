public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book book1 = new Book("Effective Java", "Joshua Bloch", "1234567890", 12);
        Book book2 = new Book("Clean Code", "Robert C. Martin", "0987654321", 6);
        library.addBook(book1);
        library.addBook(book2);

        // Print all books
        System.out.println("All books in the library:");
        library.printBooks();

        // Update tenure
        library.updateTenure();

        // Remove a book with expired tenure
        library.removeBook("0987654321");

        // Print all books after removing
        System.out.println("All books in the library after removing expired tenure:");
        library.printBooks();
    }
}
