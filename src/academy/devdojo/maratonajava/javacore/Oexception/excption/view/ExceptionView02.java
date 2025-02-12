package academy.devdojo.maratonajava.javacore.Oexception.excption.view;

import java.io.File;
import java.io.IOException;

public class ExceptionView02 {
    public static void main(String[] args) throws IOException {
        criarNewFile();
    }

    private static void criarNewFile() throws IOException {
        File file = new File("arquivo\\file.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreate);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
