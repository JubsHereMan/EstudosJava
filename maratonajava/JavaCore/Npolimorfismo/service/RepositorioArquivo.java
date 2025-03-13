package Jubs.Project.maratonajava.JavaCore.Npolimorfismo.service;

import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {


    @Override
    public void salvar() {
        System.out.println("Salvando Arquivo");
    }
}
