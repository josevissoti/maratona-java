package academy.devdojo.maratonajava.javacore.Ycolecoes.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortView01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("One Piece");
        mangas.add("Vagabond");
        mangas.add("Blue Lock");
        mangas.add("Pokemon");
        mangas.add("Hunter x Hunter");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
