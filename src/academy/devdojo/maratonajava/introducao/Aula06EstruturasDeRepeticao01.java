package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println("while: " + count);
            count++;
        }

        do {
            System.out.println("Do while: " + count);
        } while (count < 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("For: " + i);
        }
    }
}
