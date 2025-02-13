package academy.devdojo.maratonajava.javacore.Oexception.excption.view.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leiror 2");
    }
}
