package academy.devdojo.maratonajava.javacore.Oexception.runtime.view;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeException04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
        try {
            talvezThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezThrowException() throws SQLException, FileNotFoundException {

    }
}
