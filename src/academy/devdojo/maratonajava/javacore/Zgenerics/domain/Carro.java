package academy.devdojo.maratonajava.javacore.Zgenerics.domain;

public class Carro {

    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
