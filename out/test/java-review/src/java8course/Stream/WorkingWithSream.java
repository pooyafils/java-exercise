package java8course.Stream;

import java.util.List;

public class WorkingWithSream {
    List<Movie> movies =MovieUtil.createMovies();


    private  void findMovieByDirector(String director){
        movies.stream()
                .filter(m->m.getDirector().equals("Steven Spielberg")?true: false)
                .map(Movie::getName)
                .distinct() //remove the duplicate
                .limit(3)
                .forEach(System.out::println);
    }
    public static void main(String[] args){
        new WorkingWithSream().findMovieByDirector("Steven Spielberg");
    }
}
