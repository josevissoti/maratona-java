package academy.devdojo.maratonajava.javacore.Ycolecoes.view;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorView01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "One Piece", 19.9, 0));
        mangas.add(new Manga(1L, "Vagabond", 9.5, 5));
        mangas.add(new Manga(4L, "Blue Lock", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.2, 2));
        mangas.add(new Manga(2L, "Hunter x Hunter", 2.9, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();

        /*
        while(mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if(manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        */

        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);
    }
}
