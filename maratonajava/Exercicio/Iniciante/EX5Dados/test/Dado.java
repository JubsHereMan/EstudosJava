package Jubs.Project.maratonajava.Exercicio.Iniciante.EX5Dados.test;

import java.util.Random;
import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner input = new Scanner(System.in);

        boolean jogarNovamente = true;

        while (jogarNovamente) {
            int numeroDado = gerador.nextInt(6) + 1;
            System.out.println(" O dado caiu em: " + numeroDado);

            System.out.println("\nQuer jogar novamente?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");
            int resposta = input.nextInt();

            if (resposta == 2) {
                jogarNovamente = false;
                System.out.println("Obrigado por jogar! ");
            } else if (resposta != 1) {
                System.out.println("Opção inválida. Saindo do jogo...");
                jogarNovamente = false;
            }
        }

        input.close();
    }
}
