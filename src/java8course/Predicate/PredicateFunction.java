package java8course.Predicate;
// Predicate is a functional interface provided by the
// Java 8 functions library whose sole aim is to evaluate a
// condition and return true or false to the client.
//Predicate takes in a object of type T, and it has got one single abstract method called test, which returns a Boolean expression.
// There are other methods on this interface as well, such as and, or, and the last one is negate.
import java.util.function.Predicate;

public class PredicateFunction {
    Predicate<Employee> bonus=(employee) ->employee.getRatings()>10? true:false;
    Predicate<Employee> excuLambda=(employee) ->employee.getId().startsWith("E99")?true:false;
    Predicate<String> empty=s->s.isEmpty();
    public static void main(String[] args) {


    }
    }
