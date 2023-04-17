package interview;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Author {
    public Optional<List<Books>> fetchBooksByYearAvoid(int year) {

        // fetching the books may return null
        List<Books> books = null;

        return Optional.ofNullable(books);
    }

    // Avoid
    public Optional<Books[]> fetchBooksByYearAlsoAvoid(int year) {

        // fetching the books may return null
        Books[] books = null;

        return Optional.ofNullable(books);
    }

    // Prefer
    public List<Books> fetchBooksByYearPrefer(int year) {

        // fetching the books may return null
        List<Books> books = null;

        return books == null ? Collections.emptyList() : books;
    }

    // Prefer
    public Books[] fetchBooksByYearAlsoPrefer(int year) {

        // fetching the books may return null
        Books[] books = null;

        return books == null ? new Books[0] : books;
    }
}
