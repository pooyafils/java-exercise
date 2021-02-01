package java8course.Stream;
import java.util.List;
import java.util.Optional;


// Finding and Matching methods
public class Finders {

    List<Trade> trades = TradeUtil.createTrades();

    private void testFindFirst() {
        Optional<Trade> firstTrade=trades.stream().filter(Trade::isBigTrade)
                .findFirst();
        System.out.println("First trade"+firstTrade.get());

    }

    private void testFindAny() {
        Optional<Trade> anyTrade=trades.stream().filter(Trade::isBigTrade)
                .findAny();
        System.out.println("First trade"+anyTrade.get());


    }

    private void testAnyMatch() {
   Boolean rottenTrede= trades.stream().anyMatch(t->t.getStatus().equals("ROTTEN"));
    System.out.println("rotten " +rottenTrede);
    }

    private void testAllMatch() {
        Boolean ibmTrede= trades.stream().allMatch(t->t.getStatus().equals("ROTTEN"));
        System.out.println("rotten " +ibmTrede);
    }

    private void testNoneMatch() {

     boolean cancelTrade=   trades.stream().noneMatch(Trade::isCancelledTrade);
System.out.println("is canceled "+cancelTrade);
    }


    public static void main(String[] args) {
        new Finders().testFindAny();
        new Finders().testFindFirst();
        new Finders().testAnyMatch();
        new Finders().testAllMatch();
        new Finders().testNoneMatch();
    }
}
