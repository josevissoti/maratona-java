package academy.devdojo.maratonajava.javacore.Rdates.view;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeView01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.parse("2005-12-01");
        LocalTime localTime = LocalTime.parse("12:05:03");
        LocalDateTime ltd01 = localDate.atTime(localTime);
        LocalDateTime ltd02 = localTime.atDate(localDate);

        System.out.println(ltd01);
        System.out.println(ltd02);
    }
}
