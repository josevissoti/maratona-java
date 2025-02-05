package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_VALUE = 10;

    public abstract void load();

    default void checkPermission() {
        System.out.println("Checando permissão");
    }

    public static void retriveMAxValue(){
        System.out.println("Dentro do valor máximo: " + MAX_VALUE);
    }
}
