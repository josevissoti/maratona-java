package academy.devdojo.maratonajava.javacore.Oexception.execption.view;

import academy.devdojo.maratonajava.javacore.Oexception.execption.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoView01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    public static void login() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);
        String usuarioDB = "Goku";
        String senhaDB = "SSJ";
        System.out.println("Digite o usuário: ");
        String usuarioRead = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senhaRead = scanner.nextLine();

        if(!usuarioDB.equals(usuarioRead) || !senhaDB.equals(senhaRead)){
            throw new LoginInvalidoException("Usuário ou Senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
