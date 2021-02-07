package lambeda;

import java.util.function.Function;

/**
 * Created by pooya on 4/13/2020.
 */
public class FunctionClass implements Function<Integer, String> {

    public String apply(Integer t) {
     return Integer.toString(t+t);
   }


}


