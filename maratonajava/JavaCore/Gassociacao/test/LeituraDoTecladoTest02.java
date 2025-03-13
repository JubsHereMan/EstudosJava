package Jubs.Project.maratonajava.JavaCore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");

        String pergunta = input.nextLine();
        //charAT() <- PEGA O CARACTER NA POSIÇÃO QUE VC PASSAR
            if (pergunta.charAt(0) == ' '){
                System.out.println("SIM");
            }else {
                System.out.println("NAO");
            }
    }
}
