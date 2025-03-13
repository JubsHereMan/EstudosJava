package Jubs.Project.maratonajava.Exercicio.Iniciante.EX4Adivinhacao.test;

import Jubs.Project.maratonajava.Exercicio.Iniciante.EX4Adivinhacao.domain.Adivinha;

import java.util.Random;
import java.util.Scanner;

public class Adivinhe {
    public static void main(String[] args) {

        //criação de objetos
        Adivinha adivinha = new Adivinha();
        Random gerador = new Random();
        Scanner input = new Scanner(System.in);


        int numeroMaquina = gerador.nextInt(100) + 1;
        int limitador = 5;


        System.out.println(numeroMaquina);
        System.out.println("====================================================");
        System.out.println("Vamos jogar um jogo.\n Digite um numero de 1 a 100 \n você possui 5 chances: \n");


        for (int i = 0; i < limitador; i++) {
            System.out.print("Tentativa " + (i + 1) + ": ");
            int numeroEscolhido = input.nextInt();

            if (numeroEscolhido < numeroMaquina) {
                System.out.println("🔻 O número escolhido foi menor do que o número correto...");
            } else if (numeroEscolhido > numeroMaquina) {
                System.out.println("🔺 O número escolhido foi maior do que o número correto...");
            } else {
                System.out.println("🎉 **PARABÉNS!** Você acertou o número!");
                System.out.println("🏆 Você precisou de " + (i + 1) + " tentativas.");
                break;
            }
            // Última tentativa sem sucesso
            if (i == limitador - 1) {
                System.out.println("😞 Você esgotou suas tentativas. O número correto era **" + numeroMaquina + "**.");
            }
        }
        input.close();
    }

}
