package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.test;

import Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro da CalculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);
         }
}
