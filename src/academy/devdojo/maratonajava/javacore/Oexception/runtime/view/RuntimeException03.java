package academy.devdojo.maratonajava.javacore.Oexception.runtime.view;

public class RuntimeException03 {
    public static void main(String[] args) {
        abreConexao01();
        abreConexao02();
    }

    public static String abreConexao01() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recursos do SO");
        }
        return null;
    }

    public static void abreConexao02() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } finally {
            System.out.println("Fechando recursos do SO");
        }
    }
}
