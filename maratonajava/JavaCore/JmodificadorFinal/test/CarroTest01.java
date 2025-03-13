package Jubs.Project.maratonajava.JavaCore.JmodificadorFinal.test;

import Jubs.Project.maratonajava.JavaCore.JmodificadorFinal.dominio.Carro;
import Jubs.Project.maratonajava.JavaCore.JmodificadorFinal.dominio.Comprador;

import java.sql.SQLOutput;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        // Erro de compilação por tentar alterar uma constante
        // carro.VELOCIDADE_LIMITE= 180;
        Comprador comprador = new Comprador();
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
