package Jubs.Project.maratonajava.JavaCore.Npolimorfismo.test;

import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Computador;
import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Tomate;
import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {


    Computador computador = new Computador("NUC10I7",11000);
    Tomate tomate = new Tomate("Tomate Siciliano", 10);

    CalculadoraImposto.calcularImposto(computador);
        System.out.println("===================================");
    CalculadoraImposto.calcularImposto(tomate);
    }
}
