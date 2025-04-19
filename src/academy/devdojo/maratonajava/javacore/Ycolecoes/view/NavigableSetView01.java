package academy.devdojo.maratonajava.javacore.Ycolecoes.view;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetView01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "One Piece", 19.9, 0));
        mangas.add(new Manga(1L, "Vagabond", 9.5, 5));
        mangas.add(new Manga(4L, "Blue Lock", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.2, 2));
        mangas.add(new Manga(2L, "Hunter x Hunter", 2.9, 0));
        mangas.add(new Manga(10L, "Attack On Titan", 2.9, 0));
        mangas.add(new Manga(10L, "Attack On Titan", 2.9, 0));

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        Manga manga = new Manga(21L, "Jujutsu Kaisen", 3.2, 5);

        //lower <
        //floor <=
        //higher >
        //ceiling >=

        System.out.println("-----------");
        System.out.println(mangas.lower(manga));
        System.out.println(mangas.floor(manga));
        System.out.println(mangas.higher(manga));
        System.out.println(mangas.ceiling(manga));

        System.out.println("---------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
