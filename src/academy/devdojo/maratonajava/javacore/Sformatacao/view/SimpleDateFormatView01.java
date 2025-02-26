package academy.devdojo.maratonajava.javacore.Sformatacao.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatView01 {
    public static void main(String[] args) {
        String datePattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(simpleDateFormat.parse("Amsterdam 12 de janeiro de 2005"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
