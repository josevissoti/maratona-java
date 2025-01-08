package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {

    private String nome;
    private int[] episodios;

    {
        this.episodios = new int[100];
        for (int i = 0; i < this.episodios.length; i++){
            this.episodios[i] = i+1;
        }
    }

    public Anime() {
        this.episodios = new int[100];
        for (int i = 0; i < this.episodios.length; i++){
            this.episodios[i] = i+1;
        }
        for (int episodio : this.episodios){
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
