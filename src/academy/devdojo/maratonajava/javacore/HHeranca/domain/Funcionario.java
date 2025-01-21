package academy.devdojo.maratonajava.javacore.HHeranca.domain;

public class Funcionario extends Pessoa{
    private double salario;

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
