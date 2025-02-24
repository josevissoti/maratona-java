package academy.devdojo.maratonajava.javacore.Sformatacao.view;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatView01 {
    public static void main(String[] args) {
        Locale localeUS = new Locale("en", "US");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;

        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getNumberInstance();
        numberFormats[1] = NumberFormat.getNumberInstance(localeUS);
        numberFormats[2] = NumberFormat.getNumberInstance(localeJP);
        numberFormats[3] = NumberFormat.getNumberInstance(localeIT);

        double valor = 1_000_000_000.556;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
