package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    private String dataValidade;
    public static final double IMPOSTO = 0.15;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        return this.getValor() * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
