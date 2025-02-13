package academy.devdojo.maratonajava.javacore.Oexception.execption.view;

import academy.devdojo.maratonajava.javacore.Oexception.execption.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.execption.domain.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.execption.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaException01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (FileNotFoundException | LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
