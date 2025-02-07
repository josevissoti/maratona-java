package academy.devdojo.maratonajava.javacore.Npolimorfismo.view;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 9", 5000);
        Produto produto2 = new Tomate("Tomate Sírio", 8);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calculaImposto());

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calculaImposto());

    }
}
