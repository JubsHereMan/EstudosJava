package Jubs.Project.maratonajava.JavaCore.Gassociacao.test;

import Jubs.Project.maratonajava.JavaCore.Gassociacao.dominio.Jogador;
import Jubs.Project.maratonajava.JavaCore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador j = new Jogador("Less");
        Jogador j2 = new Jogador("Derke");
        Time time = new Time("Vitality");


        //RELACIONAMENTO BIDIRECIONAL
        Jogador [] jogadores = {j,j2};


        j.setTime(time);
        j2.setTime(time);
        time.setJogadores(jogadores);


        System.out.println("------Jogador-------");
        j.imprime();
        j2.imprime();
        System.out.println("------Time-------");
        time.imprime();

    }
}
