package academy.devdojo.maratonajava.javacore.Uregex.view;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherView04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os Caracteres excluindo os brancos
        // \w = a-Z A-Z, dígitos, _
        // \W = Tudo o que não fot incluso no \w
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n, m} de n até m
        // () agrupamento
        // | ou
        // $ fim da linha
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.([a-z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";

        System.out.println("Email válido");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("\nTexto:  " + texto);
        System.out.println("Índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }


}
