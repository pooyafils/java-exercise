package java9recipes.chapter3;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindingMachWord {
    public static void main(String args[]) {
String example="this is the java and jaa";
String patternString="java";
        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher=pattern.matcher(example);
while (matcher.find()){

    System.out.println(matcher.group());
    //matcher.group().replace("");
    }

    Matcher a=pattern.matcher(example);
           System.out.println( a.find());

}





        }

