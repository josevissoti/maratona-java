package academy.devdojo.maratonajava.javacore.ZZDoptional.view;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalView02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Hunter x Hunter");
        mangaByTitle.ifPresent(m -> m.setTitle("Black Clover"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository
                .finById(1).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga manga = MangaRepository.findByTitle("Dr. Stone")
                .orElseGet(() -> new Manga(4, "Dr. Stone", 120));
        System.out.println(manga);

    }

}
