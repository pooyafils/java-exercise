package interview;

public class ConsumingPresentOptional {
    public static void main(String[] args) {

        Book book = new Book();

        // Avoid
        book.displayStatusAvoid();
        book.displayStatusAlsoAvoid();

        // Prefer
        book.displayStatusPrefer();
        book.displayStatusAlsoPrefer();
    }
}
