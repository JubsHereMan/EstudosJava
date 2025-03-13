package Jubs.Project.maratonajava.JavaCore.Npolimorfismo.test;

import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Computador;
import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Produto;
import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calculaTaxa());

        System.out.println("====================================");

        Produto produto2 = new Tomate("Americano", 10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calculaTaxa());
    }
}
