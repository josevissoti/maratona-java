package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesView03 {

    private String name = "Willian";

    static class Nested {
        private String lastName = "Suane";

        void print() {
            System.out.println(new OuterClassesView03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
