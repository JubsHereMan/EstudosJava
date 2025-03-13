package Jubs.Project.maratonajava.JavaCore.Gassociacao.test;

import Jubs.Project.maratonajava.JavaCore.Gassociacao.dominio.Jogador;
import Jubs.Project.maratonajava.JavaCore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        //aqui fizemos uma associacao UNIDIRECIONAL

        Jogador j1 = new Jogador("Aspas");

        Time time = new Time("MIBR");

        //criamos uma relação entre o jogador e o time.
        j1.setTime(time);
        j1.imprime();
    }
}
