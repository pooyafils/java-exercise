package java8course.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;


//Creating Streams
public class CreatingStreams {

    // From Collections
    private void testCollectionStreams() {
        List<Movie> movies=MovieUtil.createMovies();
        movies.stream().forEach(System.out::println);
    }
    // Empty stream
    private void testEmptyStreams() {
        Stream<Movie> movieStream=Stream.empty();
        System.out.println("Empty stream: "+movieStream.count());

    }
    // From values/arrays
    private void testStreamsFromValues() {
     Stream<String> movieName=   Stream.of("Gods must be crazy","Fiddler on the roof");
     System.out.println(movieName.count());

     //this is a object that converted to stream
     String [] movieName2={"Gods must be crazy","Fiddler on the roof"};
     Stream<String> mName2=Stream.of(movieName2);


    }

    // From a file
    private void testFileStream() {

        try {
            Stream<String> fileLines = Files.lines(Paths.get("/Users/mkonda/tmp.txt"));
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void testGenerateIterateStreams() {
        Stream<Double>  random=Stream.generate(Math::random);
        random.forEach(System.out::println);

        // iterate
        Stream<Integer> wholeNumbers= Stream.iterate(1,i->i+1);
        wholeNumbers.forEach(System.out::println);

    }
    public static void main(String[] args) {
        new CreatingStreams().testEmptyStreams();
        new CreatingStreams().testStreamsFromValues();
        new CreatingStreams().testCollectionStreams();
        new CreatingStreams().testGenerateIterateStreams();
        new CreatingStreams().testFileStream();
    }

}
