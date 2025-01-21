package academy.devdojo.maratonajava.javacore.HHeranca.test;

import academy.devdojo.maratonajava.javacore.HHeranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.HHeranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.HHeranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua dos Bobos");
        endereco.setCep("012345");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Eiichiro Oda");
        pessoa.setCpf("123456789");
        pessoa.setEndereco(endereco);

        pessoa.imprint();

        System.out.println("--------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Nami");
        funcionario.setCpf("987654321");
        funcionario.setSalario(40000.00);
        funcionario.setEndereco(endereco);
        funcionario.imprint();
    }
}
