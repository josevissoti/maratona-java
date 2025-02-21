package academy.devdojo.maratonajava.javacore.Qstring.view;

public class StringBuilderView01 {
    public static void main(String[] args) {
        System.out.println("----- String -----");
        String nome = "José Pedro";
        nome = nome.concat(" Vissoti");
        System.out.println(nome);
        System.out.println(nome.substring(0, 3));

        System.out.println("----- StringBuilder -----");
        StringBuilder stringBuilder = new StringBuilder("José Pedro");
        System.out.println(stringBuilder);

        stringBuilder.append(" Vissoti").append(" Enterprise");
        System.out.println(stringBuilder);

        String sb = stringBuilder.substring(0, 3);
        System.out.println(sb);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        stringBuilder.delete(0, 3);
        System.out.println(stringBuilder);

    }
}
