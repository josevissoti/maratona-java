package academy.devdojo.maratonajava.javacore.Vio.view;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileView01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Path absulote: " + file.getAbsolutePath());
            System.out.println("is directory: " + file.isDirectory());
            System.out.println("is file: " + file.isFile());
            System.out.println("is hidden: " + file.isHidden());
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            if (file.exists()) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
