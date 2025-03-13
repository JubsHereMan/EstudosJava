package Jubs.Project.maratonajava.JavaCore.Gassociacao.test;

import Jubs.Project.maratonajava.JavaCore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Jogador j2 = new Jogador("Neymar");
        Jogador j3 = new Jogador("Cafu");
        Jogador[] jogadores = {j1, j2, j3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
