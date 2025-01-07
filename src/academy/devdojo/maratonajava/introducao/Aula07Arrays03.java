package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] num = {5, 4, 3, 2, 1};

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        for (int i : num) {
            System.out.println(i);
        }
    }
}
