package interview;

import java.util.List;
import java.util.Optional;

public class OptionalEmptyListOrArray {
    public static void main(String[] args) {

        Author author = new Author();

    // Avoid
    Optional<List<Books>> booksAvoid = author.fetchBooksByYearAvoid(2021);
    Optional<Books[]> booksAlsoAvoid = author.fetchBooksByYearAlsoAvoid(2021);

    // Prefer
    List<Books> booksPrefer = author.fetchBooksByYearPrefer(2021);
    Books[] booksAlsoPrefer = author.fetchBooksByYearAlsoPrefer(2021);
}
}
