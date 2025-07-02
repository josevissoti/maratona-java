package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesView02 {

    private String name = "Midoriya";

    void print(final String param) {
        final String lastName = "Izuku";

        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(lastName + " " + name);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesView02 outerClasses = new OuterClassesView02();
        outerClasses.print("Hero");
    }

}
