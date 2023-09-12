import java.util.List;

public interface Sortable {
    List<Book> sortByCategory(List<Book> books);
    List<Book> sortByAuthor(List<Book> books);
    List<Book> sortByTitle(List<Book> books);
    List<Book> sortByLength(List<Book> books);
    List<Book> sortByPopularity(List<Book> books);
}
