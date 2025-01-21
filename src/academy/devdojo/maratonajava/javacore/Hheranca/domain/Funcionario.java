package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização static Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor Funcionario");
    }

    public void imprint() {
        super.imprint();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
