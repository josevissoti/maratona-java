package academy.devdojo.maratonajava.javacore.Rdates.view;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateView01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2005, Month.JANUARY, 12);
        LocalDate localDateNow = LocalDate.now();

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.isLeapYear());
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println(localDate);
        System.out.println(localDateNow);

    }
}
