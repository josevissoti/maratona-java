package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Digite M ou F para seu sexo:");
        char sexo = scanner.next().charAt(0);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
