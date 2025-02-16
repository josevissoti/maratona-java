package academy.devdojo.maratonajava.exercises.exercise06.domain;

import academy.devdojo.maratonajava.exercises.exercise06.exceptions.VeiculoJaAlugadoException;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private boolean alugado;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.alugado = false;
    }

    public String alugar() {
        if (!this.alugado) {
            this.alugado = true;
            return "\nVeículo alugado com sucesso";
        } else {
            throw new VeiculoJaAlugadoException("Veículo já está alugado");
        }
    }

    public String devolver() {
        this.alugado = false;
        return "\nDevolução de veículo efetuada";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
