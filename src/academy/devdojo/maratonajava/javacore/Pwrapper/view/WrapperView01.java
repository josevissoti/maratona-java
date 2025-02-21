package academy.devdojo.maratonajava.javacore.Pwrapper.view;

public class WrapperView01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'Z';
        boolean booloanP = true;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10.0;
        Character charW = 'Z';
        Boolean booloanW = true;

        int intP2 = intW;

        Integer intW2 = Integer.parseInt("5");
        Double doubleW2 = Double.parseDouble("6.0");
        Boolean booleanW2 = Boolean.parseBoolean("True");
        System.out.println(intW2);
        System.out.println(doubleW2);
        System.out.println(booleanW2);

        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
