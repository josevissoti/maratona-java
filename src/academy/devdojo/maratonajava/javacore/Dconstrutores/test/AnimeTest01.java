package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Blue Lock", "TV", 12, "Shounen", "Toei");
        Anime anime2 = new Anime();
        anime.imprimir();
        anime2.imprimir();
    }
}
