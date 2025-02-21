package academy.devdojo.maratonajava.javacore.Oexception.execption.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 1");
    }

    public void imprint() {
        System.out.println("Leitura de Leitor 1");
    }
}
