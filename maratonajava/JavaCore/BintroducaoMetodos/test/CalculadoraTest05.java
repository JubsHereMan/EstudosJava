package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.test;

import Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};

        calculadora.somaVarArgs(numeros);
    }

}
