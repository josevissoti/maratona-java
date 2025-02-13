package academy.devdojo.maratonajava.javacore.Oexception.execption.domain;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, RuntimeException{
        System.out.println("Salvando funcionário");
    }
}
