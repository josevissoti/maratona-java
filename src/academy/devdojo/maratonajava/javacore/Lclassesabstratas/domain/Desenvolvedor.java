package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void bonusSalario() {
        this.salario *= 1.1;
    }
}
