package academy.devdojo.maratonajava.javacore.Rdates.view;

import java.util.Date;

public class DateView01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
