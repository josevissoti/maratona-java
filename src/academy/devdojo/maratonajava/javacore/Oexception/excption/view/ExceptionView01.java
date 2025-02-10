package academy.devdojo.maratonajava.javacore.Oexception.excption.view;

import java.io.File;
import java.io.IOException;

public class ExceptionView01 {
    public static void main(String[] args) {
        criarNewFile();
    }

    public static void criarNewFile() {
        File file = new File("arquivo\\file.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
