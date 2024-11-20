package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiionais04 {
    public static void main(String[] args) {
        double wage = 71000;
        double tax;

        if (wage < 0) {
            System.out.println("[ERRO] O valor do salário não é possível");
        } else {
            if (wage <= 34712) {
                tax = wage * 0.097;
            } else if (wage > 34712 && wage <= 68507) {
                tax = wage * 0.3735;
            } else {
                tax = wage * 0.4950;
            }

            System.out.println("O imposto a ser pago pelo salário de " + wage + " é de: " + tax);
        }

    }
}
