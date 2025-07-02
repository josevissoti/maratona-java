package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesView01 {

    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
        }
    }

    public static void main(String[] args) {
        OuterClassesView01 outerClass = new OuterClassesView01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesView01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
