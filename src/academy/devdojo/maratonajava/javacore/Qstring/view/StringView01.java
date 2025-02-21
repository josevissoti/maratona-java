package academy.devdojo.maratonajava.javacore.Qstring.view;

public class StringView01 {
    public static void main(String[] args) {
        String nome1 = "José Pedro";
        String nome2 = "José Pedro";
        System.out.println(nome1 == nome2);
        nome2 = nome2.concat(" Vissoti");
        System.out.println(nome1 == nome2);
        String nome3 = new String("José Pedro");
        System.out.println(nome1 == nome3);
        System.out.println(nome1 == nome3.intern());
    }
}
