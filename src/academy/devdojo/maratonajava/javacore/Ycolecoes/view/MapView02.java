package academy.devdojo.maratonajava.javacore.Ycolecoes.view;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapView02 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor("Willian Suane");
        Consumidor consumidor02 = new Consumidor("José Pedro");

        Manga manga01 = new Manga(5L, "One Piece", 19.9);
        Manga manga02 = new Manga(1L, "Vagabond", 9.5);
        Manga manga03 = new Manga(4L, "Blue Lock", 3.2);
        Manga manga04 = new Manga(3L, "Pokemon", 11.2);
        Manga manga05 = new Manga(2L, "Hunter x Hunter", 2.9);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor01, manga04);
        consumidorManga.put(consumidor02, manga01);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
