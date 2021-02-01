package java8course.Function;

import java.util.function.Function;

public class FunctionFunctionalInterface {
Function<String,Movie> createMovieFunction=s->new Movie(s);


    private void testFunction(String name) {
    Movie movie=    createMovieFunction.apply(name);
        System.out.println("Movie is "+movie);
    }

    public static void main(String[] args) {
new FunctionFunctionalInterface().testFunction("god must be crazy");

    }
}
