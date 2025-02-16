package academy.devdojo.maratonajava.exercises.exercise06.view;

import academy.devdojo.maratonajava.exercises.exercise06.domain.Carro;
import academy.devdojo.maratonajava.exercises.exercise06.domain.Moto;
import academy.devdojo.maratonajava.exercises.exercise06.service.ExibirDetalhes;

public class AlugarView {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Corcel", 2020, 4);
        Moto moto = new Moto("Honda", "Civic", 2015, 5000);

        ExibirDetalhes.exibirDetalhesVeiculo(carro);
        ExibirDetalhes.exibirDetalhesVeiculo(moto);

        System.out.println(carro.alugar());
        System.out.println(carro.devolver());

        System.out.println(moto.alugar());

        System.out.println(moto.alugar());
    }
}
