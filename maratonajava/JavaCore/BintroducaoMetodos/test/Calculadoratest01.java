package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.test;

import Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio.Calculadora;

public class Calculadoratest01 {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somoDoisNumeros();
        System.out.println("Finalizado soma");
        calc.subtraiDoisNumeros();
        System.out.println("Finalizado subtrai");
    }
}
