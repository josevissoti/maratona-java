package academy.devdojo.maratonajava.javacore.Npolimorfismo.view;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTest04 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Luffy");
        list.add("Zoro");
        list.add("Sanji");
        System.out.println(list);
    }
}
