package Jubs.Project.maratonajava.JavaCore.Npolimorfismo.service;

import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando Banco de Dados");
    }
}
