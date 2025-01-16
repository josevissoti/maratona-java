package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O ORÁCULO");
        System.out.println("Digita uma pergunta e o grande software irá responder com SIM ou NÃO");
        String question = scanner.nextLine();

        if (question.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
