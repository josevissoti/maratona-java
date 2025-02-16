package academy.devdojo.maratonajava.exercises.exercise06.service;

import academy.devdojo.maratonajava.exercises.exercise06.domain.Carro;
import academy.devdojo.maratonajava.exercises.exercise06.domain.Moto;
import academy.devdojo.maratonajava.exercises.exercise06.domain.Veiculo;

public class ExibirDetalhes {
    public static void exibirDetalhesVeiculo(Veiculo veiculo) {
        System.out.println("\n--- Exibindo informações de Veículo ---");
        System.out.println("Marca do veículo: " + veiculo.getMarca());
        System.out.println("modelo do veículo: " + veiculo.getModelo());
        System.out.println("Ano do veículo: " + veiculo.getAno());
        if (veiculo instanceof Carro carro) {
            System.out.println("Número de portas do carro: " + carro.getNumPortas());
        } else if (veiculo instanceof Moto moto) {
            System.out.println("Cilindradas da moto: " + moto.getCilindradas());
        }
    }
}
