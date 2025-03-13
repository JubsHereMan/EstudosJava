package Jubs.Project.maratonajava.JavaCore.Gassociacao.test;

import Jubs.Project.maratonajava.JavaCore.Gassociacao.dominio.Escola;
import Jubs.Project.maratonajava.JavaCore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        //RELACIONAMENTO DE 1-N  UM PARA MUITOS
        Professor professor = new Professor("Marcelo");
        Professor professor2 = new Professor("Daniela");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Baeta Neves", professores);

        escola.imprime();

    }
}
