package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double carValue = 40100, parcelValue = 0;

        for (int parcel = 1; parcel < carValue; parcel++) {
            parcelValue = carValue / parcel;
            if (parcelValue >= 1000) {
                System.out.println("Parcela: " + parcel + " R$" + parcelValue);
            } else {
                break;
            }
        }

    }
}
