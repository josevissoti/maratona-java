package academy.devdojo.maratonajava.javacore.Sformatacao.view;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatView02 {
    public static void main(String[] args) {
        Locale localeEN = new Locale("en", "US");
        Locale localeJP = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeEN);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeItaly);

        double valor = 1000.555;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$1,000.55";
        try {
            System.out.println(numberFormats[1].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
