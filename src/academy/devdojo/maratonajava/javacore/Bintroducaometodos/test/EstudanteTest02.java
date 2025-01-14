package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "Midoriya";
        estudante01.age = 15;
        estudante01.sex = 'M';

        estudante02.name = "Uraraka";
        estudante02.age = 16;
        estudante02.sex = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
