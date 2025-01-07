package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiionais03 {
    public static void main(String[] args) {
        double wage = 4000;
        if (wage > 5000) {
            System.out.println("Vou doar 500 reais para o DevDojo");
        } else {
            System.out.println("Ainda não tenho condições");
        }

        String resultado = wage > 5000 ? "Vou doar 500 reais para o DevDojo" : "Ainda não tenho condições";
        System.out.println(resultado);
    }
}
