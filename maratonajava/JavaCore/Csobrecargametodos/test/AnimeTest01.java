package Jubs.Project.maratonajava.JavaCore.Csobrecargametodos.test;

import Jubs.Project.maratonajava.JavaCore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Katekyo Hitman Reborn", "Tv", 203,"aventura");//metodo de sobrecarga

//         antes do metodo INIT
//        anime.setNome("Katekyo Hitman Reborn");
//        anime.setTipo("Tv");
//        anime.setEpisodo(203);
        anime.imprime();
    }

}
