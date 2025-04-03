package academy.devdojo.maratonajava.javacore.Ycolecoes.view;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortView01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "One Piece", 19.9));
        mangas.add(new Manga(1L, "Vagabond", 9.5));
        mangas.add(new Manga(4L, "Blue Lock", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.2));
        mangas.add(new Manga(2L, "Hunter x Hunter", 2.9));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("-------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
