package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiionais02 {
    public static void main(String[] args) {
        int age = 18;
        String category;

        if (age < 15) {
            category = "Categoria Infantil";
        } else if (age >= 15 && age < 18) {
            category = "Categoria Juvenil";
        } else {
            category = "Categoria Adulta";
        }

        System.out.println(category);
    }
}
