package academy.devdojo.maratonajava.javacore.Vio.view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterView01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);) {
            fw.write("\nO DevDojo é lindo, é o melhor curso do Brasilllllll" +
                    "\nContinuando a cantoria na próxima linha");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
