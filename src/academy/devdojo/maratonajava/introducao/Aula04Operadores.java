package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        System.out.println("Valor: " + (number2 + number1));

        int remnant = 21 % 4;
        System.out.println(remnant);


        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenEqualsTen = 10 == 10;
        boolean isTenDifferentTen = 10 != 10;

        System.out.println("isTenBiggerThanTwenty " + isTenBiggerThanTwenty);
        System.out.println("isTenSmallerThanTwenty " + isTenSmallerThanTwenty);
        System.out.println("isTenEqualsTen " + isTenEqualsTen);
        System.out.println("isTenDifferentTen " + isTenDifferentTen);


        int age = 29;
        double wage = 3500;

        boolean isInsideLawAgeBiggerThirty = age >= 30 && wage >= 4500;
        boolean isInsideLawAgeSmallerThirty = age < 30 && wage >= 3000;
        System.out.println("isInsideLawAgeBiggerThirty " + isInsideLawAgeBiggerThirty);
        System.out.println("isInsideLawAgeSmallerThirty " + isInsideLawAgeSmallerThirty);


        double moneyInBank = 5000;
        double moneyInHouse = 200;
        double playStationFiveValue = 1000;
        boolean isPlayStationFivePurchasable = moneyInHouse > playStationFiveValue || moneyInBank > playStationFiveValue;
        System.out.println("isPlayStationFivePurchasable " + isPlayStationFivePurchasable);


        int count01 = 0;
        count01 += 5;
        count01 -= 1;
        count01 *= 20;
        count01 /= 10;
        count01 %= 2;
        count01++;
        count01--;
        System.out.println(++count01);
    }
}
