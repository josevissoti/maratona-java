package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        bonusSalario();
    }

    public abstract void bonusSalario();

    @Override
    public void imprint() {
        System.out.println("Imprimindo...");
    }
}
