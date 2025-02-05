package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do Arquivo");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do Arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando Permissão do Arquivo");
    }
}
