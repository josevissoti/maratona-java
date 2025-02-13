package academy.devdojo.maratonajava.javacore.Oexception.excption.view;

import academy.devdojo.maratonajava.javacore.Oexception.excption.view.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.excption.view.domain.Leitor2;

import java.io.*;

public class TryWithResources01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo1() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
