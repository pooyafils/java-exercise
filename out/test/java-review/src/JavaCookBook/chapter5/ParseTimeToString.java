package JavaCookBook.chapter5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseTimeToString {
    public static void main(String[] args) {
        String date="1990-11-11";
        LocalDate localDate=LocalDate.parse(date);
        System.out.println(localDate);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd MMM uuuu");
        String myDate= "27 Jan 2011";
        LocalDate localDate1=LocalDate.parse(myDate,dateTimeFormatter);
        System.out.println(localDate1);


    }
}
