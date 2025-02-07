package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;

public class CalculadoraImposto {

    public static void calculaImposto(Produto produto) {
        System.out.println("--------------");
        System.out.println("Relatório de Imposto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Taxa de imposto: " + produto.calculaImposto());
    }
}
