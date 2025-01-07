package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiionais01 {
    public static void main(String[] args) {
        int age = 20;

        boolean isAgeAboveEighteen = age >= 18;

        if (isAgeAboveEighteen) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }
    }

}
