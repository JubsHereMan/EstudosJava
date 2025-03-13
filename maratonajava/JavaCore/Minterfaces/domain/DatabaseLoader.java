package Jubs.Project.maratonajava.JavaCore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader,DataRemover {
//MAIS RESTRITO                 MENOS RESTRITO
//   |                                 |
//   V                                 V
//private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados.");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissões no banco de dados");
    }
}
