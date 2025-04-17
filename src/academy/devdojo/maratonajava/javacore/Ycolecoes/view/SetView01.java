package academy.devdojo.maratonajava.javacore.Ycolecoes.view;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetView01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "One Piece", 19.9, 0));
        mangas.add(new Manga(1L, "Vagabond", 9.5, 5));
        mangas.add(new Manga(4L, "Blue Lock", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.2, 2));
        mangas.add(new Manga(2L, "Hunter x Hunter", 2.9, 0));
        mangas.add(new Manga(2L, "Hunter x Hunter", 2.9, 0));

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
