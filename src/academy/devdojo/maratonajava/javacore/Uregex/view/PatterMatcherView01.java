package academy.devdojo.maratonajava.javacore.Uregex.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherView01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto1 = "abaaba";
        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto1);

        System.out.println("Texto:  " + texto1);
        System.out.println("Índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        matcher = pattern.matcher(texto2);

        System.out.println("\nTexto:  " + texto2);
        System.out.println("Índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os Caracteres excluindo os brancos
        // \w = a-Z A-Z, dígitos, _
        // \W = Tudo o que não fot incluso no \w
        regex = "\\W";
        String texto3 = "fka_s1h fi23!af6";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto3);

        System.out.println("\nTexto:  " + texto3);
        System.out.println("Índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }


}
