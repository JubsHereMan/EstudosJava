package Jubs.Project.maratonajava.JavaCore.Gassociacao.dominio;

import Jubs.Project.maratonajava.JavaCore.Gassociacao.Exercicio.dominio.Seminario;

public class Professor {
    private String nome;
    private String especialidade;



    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
