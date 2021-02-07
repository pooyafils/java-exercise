package StreamApi;

/**
 * Created by pooya on 4/18/2020.
 */
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
 import java.util.stream.Stream;
public class StramIntDoubleLong {
    public static void main(String []args){
        int[] values={3,4,5,6,8,12,0,65};
        System.out.println("Average of even number "
                +IntStream.of(values).distinct().filter(e->e % 2==0)
                .average().getAsDouble()
        );
        System.out.println("The sum of the "+IntStream.of(values)
                .sum()
        );
        IntSummaryStatistics stats =
                 IntStream.of(values).summaryStatistics();
        System.out.println(stats.getMin());

        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                 "George", "Alan", "Stacy", "Michelle", "john"};
        System.out.println("Total character count for all names is"
                +Stream.of(names).mapToInt(e->e.length()).sum()
        );
        System.out.println("The number of digits in array values is"
                + Stream.of(names).map(e->e+"").mapToInt(e->e.length()).sum()

        );
    }
}
