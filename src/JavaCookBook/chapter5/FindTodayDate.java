package JavaCookBook.chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FindTodayDate {
    public static void main(String[] args) {
        LocalDate dnow=LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println(dnow);
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime+" "+LocalTime.now().format(dtf));
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
