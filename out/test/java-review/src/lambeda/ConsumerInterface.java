package lambeda;

import java.util.function.Consumer;

/**
 * Created by pooya on 4/13/2020.
 */
public class ConsumerInterface {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Consumer<Long> lambdaConsumer = (Long t) -> System.out.println(t*t);
            lambdaConsumer.accept(new Long(5));

        }

    }
