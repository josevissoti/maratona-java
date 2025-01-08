package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {

    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++){
            Anime.episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++){
            Anime.episodios[i] = i+1;
        }
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime() {
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++){
            Anime.episodios[i] = i+1;
        }
        for (int episodio : Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
