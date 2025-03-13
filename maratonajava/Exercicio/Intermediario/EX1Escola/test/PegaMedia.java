package Jubs.Project.maratonajava.Exercicio.Intermediario.EX1Escola.test;

import Jubs.Project.maratonajava.Exercicio.Intermediario.EX1Escola.domain.Aluno;
import Jubs.Project.maratonajava.Exercicio.Intermediario.EX1Escola.domain.EstadoAluno;

import java.util.Scanner;

public class PegaMedia {
    public static void main(String[] args) {
        //criando os objetos
        Aluno aluno = new Aluno();
        Scanner input = new Scanner(System.in);

        //inserindo os dados
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(input.nextLine());

        //loop para não ter tanto print
        for(int i = 0; i < aluno.getNota().length;i++){
            System.out.println("Insira a nota do aluno: ");
            aluno.getNota()[i] = input.nextInt();
        }

        double media = aluno.calcularMedia();
        
        if(media >=7){
            System.out.println("ESTADO ALUNO: " + EstadoAluno.APROVADO);
        } else if (media >=5 && media <=6.9) {
            System.out.println("ESTADO ALUNO: " + EstadoAluno.RECUPERACAO);
        }else{
            System.out.println("ESTADO ALUNO: " + EstadoAluno.REPROVADO);
        }

        input.close();
    }

}
