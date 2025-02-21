package academy.devdojo.maratonajava.javacore.Qstring.view;

public class StringView02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String nome2 = "       Zoro       ";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.replace("L", "R"));
        System.out.println(nome.substring(2, nome.length()));
        System.out.println(nome2.length());
        System.out.println(nome2.trim());

    }
}
