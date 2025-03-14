package academy.devdojo.maratonajava.javacore.Wnio.view;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamView01 {
    public static void main(String[] args) {
        Path fileZip = Paths.get("pasta/arquivo.zip");
        Path filesToZip = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(fileZip, filesToZip);
    }

    private static void zip(Path fileZip, Path filesToZip) {
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(fileZip))) {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip);
            for(Path file : directoryStream){
                System.out.println(file.getFileName());
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(file, zipOutputStream);
                zipOutputStream.closeEntry();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
