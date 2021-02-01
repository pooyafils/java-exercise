package java8course.Stream;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toMap;



// Collecting operations
public class Collecting {
    List<Trade> trades = TradeUtil.createTrades();

    private void collectIntoAList() {
      List<Trade> tradeCollection=  trades.stream().collect(Collectors.toList());
      System.out.println(tradeCollection);

    }
    private void collectIntoASet() {
        Set<Trade> tradeCollectionSet=  trades.stream().collect(Collectors.toSet());
        System.out.println(tradeCollectionSet);

    }
    private void collectIntoToAMap() {
        List<Movie> movies=MovieUtil.createMovies();
      Map<String,Movie> movieM= movies.stream().collect(toMap(Movie::getName,movie->movie));
      System.out.println(movieM);

    }

    public static void main(String[] args) {
        new Collecting().collectIntoAList();
        new Collecting().collectIntoASet();
        new Collecting().collectIntoToAMap();
    }

}
