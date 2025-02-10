package academy.devdojo.maratonajava.exercises.exercise05.domain.enums;

public enum Bloco {
    BLOCO1A("1", "A"),
    BLOCO1B("1", "B"),
    BLOCO1C("1", "C"),
    BLOCO2A("2", "A"),
    BLOCO2B("2", "B"),
    BLOCO2C("2", "C"),
    BLOCO3A("3", "A"),
    BLOCO3B("3", "B"),
    BLOCO3C("3", "C");


    public final String ANO;
    public final String BLOCO;

    Bloco(String ANO, String BLOCO) {
        this.ANO = ANO;
        this.BLOCO = BLOCO;
    }

}
