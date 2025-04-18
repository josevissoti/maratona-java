package academy.devdojo.maratonajava.javacore.Xserialization.view;

import academy.devdojo.maratonajava.javacore.Xserialization.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Xserialization.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoView01 {
    public static void main(String[] args) {
        Turma turma = new Turma("Maratona Java Virado no Jiraya em Breve Ricos");
        Aluno aluno = new Aluno(1L, "Willian Suane", "12345678987654321");
        aluno.setTurma(turma);

        serializar(aluno);
        desserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
