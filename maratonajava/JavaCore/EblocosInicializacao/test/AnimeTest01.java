package Jubs.Project.maratonajava.JavaCore.EblocosInicializacao.test;

import Jubs.Project.maratonajava.JavaCore.EblocosInicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
