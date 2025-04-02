package academy.devdojo.maratonajava.javacore.Ycolecoes.view;

import java.util.ArrayList;
import java.util.List;

public class ListView01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16); // Versão 1.4
        List<String> nomes2 = new ArrayList<>(16); // Versão 1.4
        nomes.add("Willian");
        nomes.add("DevDojo");
        nomes2.add("Suane");
        nomes2.add("Academy");
        // System.out.println(nomes.remove("Willian"));

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
