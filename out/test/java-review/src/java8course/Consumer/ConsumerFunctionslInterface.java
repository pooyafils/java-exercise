package java8course.Consumer;

import java8course.ConstructorReferences;

import java.util.function.Consumer;

public class ConsumerFunctionslInterface {
    //consumer for pringting a info
Consumer<Movie> printInfo=m->System.out.println("Printing out movie "+m);
    //consumer for persisting movie
Consumer<Movie> persistMovie=m->persisit(m);
    //consumer for movie notification
    Consumer<Movie> notifyMovie=m->notify(m);

    private void persisit(Movie m) {
        System.out.println("persisting a movie "+m);
    }

    private void  testConsumer(Movie movie){
        printInfo.accept(movie);
        persistMovie.accept(movie);
}
private void notify(Movie m){
        System.out.println("Notify about movie " +m);
}
public void testAndThan(Movie movie){
        //first we print the info than we persist it
    //you can also change the order of which one is the first
  Consumer<Movie> printAndThanPersistMovie= printInfo.andThen(persistMovie);
  printAndThanPersistMovie.accept(movie);
    Consumer<Movie> chainedConsumer=notifyMovie.andThen(persistMovie).andThen(printInfo);
    chainedConsumer.accept(movie);

}
public static void main(String args[]){
        Movie movie=new Movie("gods must crzy");
        new ConsumerFunctionslInterface().testConsumer(movie);
        new ConsumerFunctionslInterface().testAndThan(movie);
        //new ConsumerFunctionslInterface().testAndThan(movie);
}
}
