package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        int ageInt = 10;
        byte ageByte = 10;
        short ageShort = 10;
        long ageLong = 10000000L;
        float wageFloat = 10.0f;
        double wageDouble = 3000.00;
        boolean trueCheck = true;
        char character = 'A';
        String name = "Monkey D. Luffy";

        System.out.println("Age is " + ageInt + " years old");
        System.out.println("Age is " + ageByte + " years old");
        System.out.println("Age is " + ageShort + " years old");
        System.out.println("Age is " + ageLong + " years old");
        System.out.println("Wage is " + wageFloat);
        System.out.println("Wage is " + wageDouble);
        System.out.println("Check: " + trueCheck);
        System.out.println("The character is " + character);
        System.out.println("Hi, my name is " + name);
    }

}
