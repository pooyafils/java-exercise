package masteringthreadcourse.chapterfive.project;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {
    private static final String input="a friend in need is a friend indeed";
    public static void main(String[] args) {
     List<String>  inputList= Arrays.asList(input.split(" "));

    }

    static class Mapper implements Runnable{
private  final List<String> input;

        Mapper(List<String> input) {
            this.input = input;
        }

        @Override
        public void run() {

        }
    }
    static class Partitioner implements Runnable{

        @Override
        public void run() {

        }
    }
}
