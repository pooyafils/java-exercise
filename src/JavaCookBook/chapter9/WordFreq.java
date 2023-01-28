package JavaCookBook.chapter9;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class WordFreq {
    public static void main(String[] args) throws IOException {
// 1) Collect words with a mutable reduction into Map<String,Long>.
        Map<String,Long> map = Files.lines(Path.of("E:\\java-exercise\\src\\JavaCookBook\\chapter9\\mytext.txt"))
                .flatMap(s -> Stream.of(s.split(" +")))
                .collect(Collectors.groupingBy(
                        String::toLowerCase, Collectors.counting()));
// 2) Print results sorted numerically descending, limit 20
        map.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue() .reversed())
                .limit(20)
                .map(entry -> String.format("%4d %s", entry.getValue(), entry.getKey()))
                .forEach(System.out::println);
    }
}
