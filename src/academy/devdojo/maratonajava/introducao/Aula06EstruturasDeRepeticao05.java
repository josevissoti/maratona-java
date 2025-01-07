package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double carValue = 30000;

        for (int parcel = (int) carValue; parcel >= 1; parcel--) {
            double parcelValue = carValue / parcel;
            if (parcelValue < 1000) {
                continue;
            }
            System.out.println("Parcela: " + parcel + " R$" + parcelValue);
        }
    }
}
