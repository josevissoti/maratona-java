package academy.devdojo.maratonajava.javacore.Sformatacao.view;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleView01 {
    public static void main(String[] args) {
        Locale localeItalia = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println(dateFormat1.format(calendar.getTime()));
        System.out.println(dateFormat2.format(calendar.getTime()));
        System.out.println(dateFormat3.format(calendar.getTime()));
        System.out.println(dateFormat4.format(calendar.getTime()));
        System.out.println(dateFormat5.format(calendar.getTime()));

        System.out.println(localeJapao.getDisplayCountry(localeJapao));
    }
}
