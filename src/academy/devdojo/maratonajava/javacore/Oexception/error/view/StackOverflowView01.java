package academy.devdojo.maratonajava.javacore.Oexception.error.view;

public class StackOverflowView01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
