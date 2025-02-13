package academy.devdojo.maratonajava.javacore.Oexception.execption.view;

import java.io.File;
import java.io.IOException;

public class ExceptionView01 {
    public static void main(String[] args) {
        criarNewFile();
    }

    private static void criarNewFile() {
        File file = new File("arquivo\\file.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
