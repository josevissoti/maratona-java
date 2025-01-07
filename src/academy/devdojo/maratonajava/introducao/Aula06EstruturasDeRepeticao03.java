package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {

        int maxValue = 50;
        for (int i = 0; i <= maxValue; i++) {
            if (i <= 25) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }
}
