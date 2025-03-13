package Jubs.Project.maratonajava.JavaCore.AIntroducaoClasses.Test;

import Jubs.Project.maratonajava.JavaCore.AIntroducaoClasses.Dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
//           variavel                 OBJ
//           referancia            ESTUDANTE
//     |                   |     |          |
//                v                    v
        Estudante estudante= new Estudante();
        estudante.nome ="Tsuna";
        estudante.idade= 16;
        estudante.sexo="Masculino";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
