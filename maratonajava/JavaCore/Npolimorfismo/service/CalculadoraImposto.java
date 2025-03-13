package Jubs.Project.maratonajava.JavaCore.Npolimorfismo.service;

import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Computador;
import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Produto;
import Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
//metodo receber o objeto e usando as regras herança do java podemos ter o polimorfismo
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calculaTaxa();
        System.out.println("Produto" + produto.getNome());
        System.out.println("Valor " + produto.getValor());
        System.out.println("imposto a ser pago " + imposto );

        //pode ser interessante criar uma subclasse de ITENS PERECIVEIS
        //Então a logica seria Produto(Pai) -> Perecivel(Filho) -> Tomate(Neto)
        //então nessa linha estaria perguntando
        //Produto é uma instancia de  perecivel
        if(produto instanceof Tomate){
        //fazendo cast
        System.out.println(((Tomate)produto).getDataValidade());
        }
    }


}
