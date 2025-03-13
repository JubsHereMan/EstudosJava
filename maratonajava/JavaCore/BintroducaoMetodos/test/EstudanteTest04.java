package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.test;

import Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio.Estudante;

public class EstudanteTest04 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();


        estudante.nome ="Seiya";
        estudante.idade=16;
        estudante.sexo="Masculino";

        estudante2.nome ="Saori";
        estudante2.idade=16;
        estudante2.sexo="Feminino";

        estudante.imprime();
        estudante2.imprime();

    }
}
