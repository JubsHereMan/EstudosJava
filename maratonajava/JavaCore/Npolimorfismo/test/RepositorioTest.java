package Jubs.Project.maratonajava.JavaCore.Npolimorfismo.test;

import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.repositorio.Repositorio;
import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.service.RepositorioBancoDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDados();
      //  Repositorio repositorio = new RepositorioMemoria();
      //  Repositorio repositorio = new RepositorioArquivo();

        repositorio.salvar();
    }
}
