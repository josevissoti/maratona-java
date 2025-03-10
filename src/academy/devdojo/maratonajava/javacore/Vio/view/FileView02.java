package academy.devdojo.maratonajava.javacore.Vio.view;

import java.io.File;
import java.io.IOException;

public class FileView02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        boolean isDirectoryCriado = fileDirectory.mkdir();
        System.out.println("Pasta criada: " + isDirectoryCriado);

        File fileArquivoDiretorio = new File(fileDirectory, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado: " + isFileCreated);

        File fileRenamed = new File(fileDirectory, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado: " + isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(diretorioRenamed);
        System.out.println("Diretório renomeado: " + isDirectoryRenamed);

    }
}
