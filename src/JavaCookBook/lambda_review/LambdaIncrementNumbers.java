package JavaCookBook.lambda_review;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class  LambdaIncrementNumbers {
    @FunctionalInterface
    public interface increment{
        public int numbersIncrement(int a);
    }
    public static void main(String args[]){
        increment obj=x->x+2;
        increment moreAdvance=(int x)->{
            if(x>10){
            return x*x;
            //if number is grater than 10 multiple it
            }
            return x;
        };
        System.out.println("lambda non block code "+obj.numbersIncrement(2));
        System.out.println("lambda with block style "+moreAdvance.numbersIncrement(21));

    }
}
