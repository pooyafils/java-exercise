package StreamApi;

/**
 * Created by pooya on 4/17/2020.
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StramApiExampls {
    public static void main(String []args){
        ArrayList<String> namesarraylist=new ArrayList<String>();
        namesarraylist.add("pooya"); namesarraylist.add("alex"); namesarraylist.add("peter"); namesarraylist.add("susan"); namesarraylist.add("aln");
        String [] names={"pooya","alex","jhon","alan","peter","Susan",
        "kim","jenifer"};
        //display 4 first elements
        Stream.of(names).limit(4).sorted().forEach(e -> System.out.print(e + " "));
       // namesarraylist.stream().limit(4).sorted().forEach(e->System.out.print(e+" "));
        System.out.println();
        Stream.of(names).skip(4).sorted((e1,e2)->e1.compareToIgnoreCase(e2))
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
        Stream.of(names).skip(4).sorted(String::compareToIgnoreCase)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("\nLargest string with length > 4:"
                        + Stream.of(names).filter(e -> e.length() > 4).count()
        );
        System.out.println("Smallest string alphabetically: "
         + Stream.of(names).min(String::compareTo).get()
        );
        System.out.println(" 2 string length: "+ Stream.of(names).filter(e->e.length()<5)
        );
        System.out.println("pooya is in names? "+ Stream.of(names).anyMatch(e->e.equals("pooya"))
        );
        System.out.println("any name start with a? "+ Stream.of(names).anyMatch(e -> e.startsWith("a"))
        );
        System.out.println("Number of distinct case-insensitive strings: "+ Stream.of(names).map(e->e.toUpperCase())
                .distinct().count()
        );
        System.out.println("First element in this stream in lowercase: " + Stream.of(names).map(String::toLowerCase).findFirst().get()

        );

       // Stream.of(names).forEach(e->System.out.print(e+" "));
        // write a stream that change the name with uppercase and print it
       List<String> result=  Stream.of(names).map(e->e.toUpperCase()).collect(Collectors.toList());
        System.out.println(" " + result);
   
    }


}
