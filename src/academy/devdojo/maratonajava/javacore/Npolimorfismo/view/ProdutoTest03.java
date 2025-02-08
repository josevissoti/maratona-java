package academy.devdojo.maratonajava.javacore.Npolimorfismo.view;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Intel 11", 200000);
        Tomate tomate = new Tomate("Tomate Brasileiro", 15);
        tomate.setDataValidade("11/11/2025");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
