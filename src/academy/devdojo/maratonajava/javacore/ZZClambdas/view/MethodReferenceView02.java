package academy.devdojo.maratonajava.javacore.ZZClambdas.view;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceView02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 800),
                new Anime("One Piece", 1200),
                new Anime("Naruto", 720)
        ));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        //animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
