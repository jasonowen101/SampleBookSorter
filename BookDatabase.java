import java.util.ArrayList;
import java.util.List;

public class BookDatabase {
    private List<Book> books;

    public BookDatabase() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
