package java9recipes;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class replacingTextThatFounded {
    public static void main(String args[]) {

        String str = "I love Java 8!  It is my favorite language.  Java 8"
                + "8th version of this great programming language.";

        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);
        System.out.println("Original: " + str);
        System.out.println(matcher.matches());
        System.out.println("Replacement: " + matcher.replaceAll("9"));
    }
    }
