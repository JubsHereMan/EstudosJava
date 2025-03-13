package Jubs.Project.maratonajava.Exercicio.Iniciante.EX1Calc.test;

import Jubs.Project.maratonajava.Exercicio.Iniciante.EX1Calc.domain.Calculadora;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.println("escolha o primeiro valor: ");
        int num1 = input.nextInt();
        System.out.println("escolha o segundo valor: ");
        int num2 = input.nextInt();

        calc.setNum1(num1);
        calc.setNum2(num2);

        System.out.println("1 - somar");
        System.out.println("2- subtrair");
        System.out.println("3- multiplicar");
        System.out.println("4- dividir");

        System.out.println("Digite uma opçao para escolher um operador ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + calc.somaNumeros());
                break;
            case 2:
                System.out.println("Resultado: " +   calc.subtraiNumeros());
                break;
            case 3:
                System.out.println("Resultado: " + calc.multiplicaNumeros());
                break;
            case 4:
                System.out.println("Resultado: " + calc.divideNumeros());
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        input.close();

    }
}
