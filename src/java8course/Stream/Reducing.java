package java8course.Stream;
import Stream.Stream;
import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toMap;


// Reducing Operation
public class Reducing {
    List<Trade> trades = TradeUtil.createTrades();
    List<Integer> ints = Arrays.asList();

    private void tradeInstrumentsList() {
    Optional<String> intsList=    trades.stream().map(Trade::getInstrument)
                .reduce((a,b)->a+","+b);
        System.out.println(intsList);

    }

    private void schoolStaff() {
        List<Integer> ints= Arrays.asList(11,12,13,15);
      int stuff=  ints.stream().reduce(10,(i,j)->i+j);
      System.out.println("Tosl stuff "+stuff);
    }

    private void tradeQuantitySum() {
        Optional<Integer> totalQuntity=    trades.stream().map(Trade::getQuantity)
                .reduce((a,b)->a+b);
        System.out.println(totalQuntity);

    }

    public static void main(String[] args) {
       // new Reducing().schoolStaff();
      //  new Reducing().tradeQuantitySum();
        new Reducing().tradeInstrumentsList();
    }

}
