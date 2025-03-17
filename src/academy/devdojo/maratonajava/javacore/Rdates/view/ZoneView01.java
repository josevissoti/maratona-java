package academy.devdojo.maratonajava.javacore.Rdates.view;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneView01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId zoneIdOdTokyo = ZoneId.of("Asia/Tokyo");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneIdOdTokyo);
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime2 = instant.atZone(zoneIdOdTokyo);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset zoneOffset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = localDateTime.atOffset(zoneOffset);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(localDateTime, zoneOffset);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = instant.atOffset(zoneOffset);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate date = LocalDate.of(1900, 2, 1);
        JapaneseDate japaneseDate2 = JapaneseDate.from(date);
        System.out.println(japaneseDate2);
    }
}
