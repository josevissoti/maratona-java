package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeDados(Funcionario funcionario) {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salario : this.salarios) {
                System.out.println("R$" + salario);
            }
        }

        mediaSalarios(funcionario);
    }

    public void mediaSalarios(Funcionario funcionario) {
        if (salarios != null) {
            for (double salario : this.salarios) {
                this.media += salario;
            }

            this.media /= this.salarios.length;
            System.out.println("A média dos salários é: " + this.media);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
