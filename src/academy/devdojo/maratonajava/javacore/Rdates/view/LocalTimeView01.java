package academy.devdojo.maratonajava.javacore.Rdates.view;

import java.time.LocalTime;

public class LocalTimeView01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 56, 12);
        LocalTime localTimeNow = LocalTime.now();

        System.out.println(localTime);
        System.out.println(localTimeNow);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTimeNow.getNano());
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
