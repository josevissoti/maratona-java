package academy.devdojo.maratonajava.exercises.exercise08;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();
        validarCpf(cpf);
    }

    public static void validarCpf(String cpf) {
        Pattern pattern = Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}");
        Matcher matcher = pattern.matcher(cpf);
        System.out.println("CPF válidos: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
