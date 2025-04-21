package academy.devdojo.maratonajava.javacore.Ycolecoes.view;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueView02 {
    public static void main(String[] args) {
        Queue<Manga> mangaQueue = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangaQueue.add(new Manga(5L, "One Piece", 19.9));
        mangaQueue.add(new Manga(1L, "Vagabond", 9.5));
        mangaQueue.add(new Manga(4L, "Blue Lock", 3.2));
        mangaQueue.add(new Manga(3L, "Pokemon", 11.2));
        mangaQueue.add(new Manga(2L, "Hunter x Hunter", 2.9));

        while (!mangaQueue.isEmpty()) {
            System.out.println(mangaQueue.poll());
        }
    }
}
