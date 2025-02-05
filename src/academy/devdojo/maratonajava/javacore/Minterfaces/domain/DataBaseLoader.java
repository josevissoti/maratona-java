package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados da Base de Dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados da Base de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão da Base de Dados");
    }
}
