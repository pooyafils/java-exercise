package JavaCookBook.chapter6;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("yyyy/LL/dd");
        System.out.println(dateFormatter.format(LocalDate.now()));
        System.out.println(LocalDate.parse("2014/04/01",dateFormatter));
        DateTimeFormatter nTZ =
                DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
        System.out.println(ZonedDateTime.now().format(nTZ));
    }
}
