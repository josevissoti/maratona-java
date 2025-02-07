package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    private int dataValidade;
    public static final double IMPOSTO = 0.15;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        return this.getValor() * IMPOSTO;
    }

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }
}
