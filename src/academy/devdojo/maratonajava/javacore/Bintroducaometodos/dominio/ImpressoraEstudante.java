package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {

    public void imprimeEstudante(Estudante estudante){
        System.out.println("-------------");
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }

}
