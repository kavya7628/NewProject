public class Book {
    private String title;
    private String author;
    private String isbn;
    private int tenure; // in months

    // Constructor
    public Book(String title, String author, String isbn, int tenure) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.tenure = tenure;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", tenure=" + tenure +
                '}';
    }
}
