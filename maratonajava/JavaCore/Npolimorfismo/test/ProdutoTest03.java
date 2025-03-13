package Jubs.Project.maratonajava.JavaCore.Npolimorfismo.test;

import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Computador;
import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Produto;
import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Tomate;
import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
    Tomate tomate = new Tomate("Americano", 20);
    tomate.setDataValidade("11/12/2025");

    CalculadoraImposto.calcularImposto(tomate);

    }
}
