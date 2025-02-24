package academy.devdojo.maratonajava.javacore.Sformatacao.view;

import java.util.Locale;

public class LocaleView02 {
    public static void main(String[] args) {
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }
        System.out.println();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
    }
}
