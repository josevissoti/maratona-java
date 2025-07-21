package academy.devdojo.maratonajava.javacore.ZZClambdas.view;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceView01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 800),
                new Anime("One Piece", 1200),
                new Anime("Naruto", 720)
        ));

        //animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);

        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
