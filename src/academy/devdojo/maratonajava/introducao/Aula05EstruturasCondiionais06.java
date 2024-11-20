package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiionais06 {
    public static void main(String[] args) {
        int dayWeek = 3;

        switch (dayWeek){
            case 1, 7:
                System.out.println("Final de semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Resposta inválida");
        }
    }
}
