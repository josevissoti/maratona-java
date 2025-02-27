package academy.devdojo.maratonajava.javacore.Rdates.view;

import java.time.Instant;
import java.time.LocalDate;

public class InstantView01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Instant now = Instant.now();

        System.out.println(localDate);
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3, 1000000000));
        System.out.println(Instant.ofEpochSecond(3, -1000000000));
    }
}
