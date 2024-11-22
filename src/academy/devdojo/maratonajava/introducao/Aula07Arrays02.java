package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[4];

        names[0] = "Luffy";
        names[1] = "Kurosaki";
        names[2] = "Goku";
        names[3] = "Hinata";

        for (int i = 0; i <= 3; i++) {
            System.out.println(names[i]);
        }
    }
}
