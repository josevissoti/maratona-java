package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Rua São Paulo n°534");
        Local local2 = new Local("Rua Rio de Janeiro n°193");

        Professor professor1 = new Professor("Marcia", "Matemática");
        Professor professor2 = new Professor("Reinaldo", "Inglês");

        Aluno aluno1 = new Aluno("João", 21);
        Aluno aluno2 = new Aluno("Bianca", 19);
        Aluno aluno3 = new Aluno("Maria", 24);

        Seminario seminario1 = new Seminario("Dados e suas propriedades", local2);
        Seminario seminario2 = new Seminario("A importância da Língua Inglesa", local1);

        Aluno[] alunos1 = {aluno2, aluno3};
        Aluno[] alunos2 = {aluno1};
        Seminario[] seminarios1 = {seminario1};
        Seminario[] seminarios2 = {seminario2};

        aluno1.setSeminario(seminario2);
        aluno2.setSeminario(seminario1);
        aluno3.setSeminario(seminario1);

        professor1.setSeminarios(seminarios1);
        professor2.setSeminarios(seminarios2);

        seminario1.setAlunos(alunos1);
        seminario2.setAlunos(alunos2);

        seminario1.imprint();
        seminario2.imprint();
        aluno1.imprint();
        aluno2.imprint();
        aluno3.imprint();
        professor1.imprint();
        professor2.imprint();
    }
}
