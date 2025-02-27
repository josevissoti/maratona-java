package academy.devdojo.maratonajava.javacore.Rdates.view;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationView01 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.now().plusHours(2);
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.now().minusHours(7);

        Duration duration1 = Duration.between(ldt1, ldt2);
        Duration duration2 = Duration.between(lt1, lt2);
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration duration4 = Duration.ofDays(3);
        Duration duration5 = Duration.ofMinutes(20);
        Duration duration6 = Duration.of(3, ChronoUnit.HOURS);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        System.out.println(duration5);
        System.out.println(duration6);
    }
}
