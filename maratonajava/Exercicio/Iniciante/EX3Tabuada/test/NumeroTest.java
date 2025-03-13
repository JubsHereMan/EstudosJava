package Jubs.Project.maratonajava.Exercicio.Iniciante.EX3Tabuada.test;

import Jubs.Project.maratonajava.Exercicio.Iniciante.EX3Tabuada.domain.Numeros;


import java.util.Scanner;

public class NumeroTest {
    public static void main(String[] args) {

        Numeros n = new Numeros();
        Scanner input = new Scanner(System.in);




        System.out.println("Digite um numero: ");
        int numero = input.nextInt();
        n.setNumeroEscolhido(numero);
        int escolhido = n.getNumeroEscolhido();
        System.out.println("O numero escolhido foi: "+escolhido);

        for(int i = 1; i <= 10 ; i++){
            System.out.println(escolhido + "X" + i +" = " + escolhido * i);
        }

    }
}
