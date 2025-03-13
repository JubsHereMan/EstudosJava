package Jubs.Project.maratonajava.JavaCore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        //INPUT DE DADOS AEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome abaixo: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Digite M ou F para o seu sexo : ");
        char sexo = teclado.next().charAt(0);
        System.out.println("----------------------------");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Sexo: " +sexo);

    }
}
