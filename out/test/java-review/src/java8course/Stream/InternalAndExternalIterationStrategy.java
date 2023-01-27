package java8course.Stream;
import java.util.ArrayList;
import java.util.List;


// Internal and External iteration strategies
public class InternalAndExternalIterationStrategy {
    List<Movie> movies = MovieUtil.createMovies();
    List<Movie> top2Classics = new ArrayList<Movie>(10);

    private void testExternalIteration1() {
for(Movie m: movies){
    if(m.isClassic()){
        top2Classics.add(m);
    }
}
        System.out.println("Top 2 class (Ext Iteration): "+ top2Classics);
    }
    private void testInternalIteration1() {
movies.stream().filter(Movie::isClassic)
        .map(Movie::getName)
        .limit(2)
        .forEach(System.out::println);

    }

    private void testInternalIteration2() {

    }

    private void testInternalIteration3() {
    }

    public static void main(String[] args) {
        new InternalAndExternalIterationStrategy().testInternalIteration1();
        new InternalAndExternalIterationStrategy().testInternalIteration2();
        new InternalAndExternalIterationStrategy().testInternalIteration3();
        new InternalAndExternalIterationStrategy().testExternalIteration1();
    }

}
