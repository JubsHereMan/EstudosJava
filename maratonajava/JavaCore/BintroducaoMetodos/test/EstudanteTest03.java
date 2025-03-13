package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.test;

import Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio.Estudante;
import Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest03 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante imp = new ImpressoraEstudante();

        estudante.nome ="Seiya";
        estudante.idade=16;
        estudante.sexo="Masculino";

        estudante2.nome ="Saori";
        estudante2.idade=16;
        estudante2.sexo="Feminino";

        imp.imprime(estudante);
        imp.imprime(estudante2);
    }
}
