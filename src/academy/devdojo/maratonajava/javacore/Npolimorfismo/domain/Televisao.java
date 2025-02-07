package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Televisao extends Produto {
    public static final double IMPOSTO = 0.20;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        return this.getValor() * IMPOSTO;
    }
}
