package academy.devdojo.maratonajava.javacore.Uregex.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherView02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os Caracteres excluindo os brancos
        // \w = a-Z A-Z, dígitos, _
        // \W = Tudo o que não fot incluso no \w
        // []
        String regex = "[a-zA-C]";
        String texto = "cafeBASE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("\nTexto:  " + texto);
        System.out.println("Índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);

        regex = "0[xX][0-9a-fA-F]";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto2);

        System.out.println("\nTexto:  " + texto2);
        System.out.println("Índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }


}
