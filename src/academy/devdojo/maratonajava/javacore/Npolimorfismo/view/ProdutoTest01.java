package academy.devdojo.maratonajava.javacore.Npolimorfismo.view;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Intel 7", 10000);
        Tomate tomate = new Tomate("Tomate Burguês", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 20000);

        CalculadoraImposto.calculaImposto(computador);
        CalculadoraImposto.calculaImposto(tomate);
        CalculadoraImposto.calculaImposto(televisao);
    }
}
