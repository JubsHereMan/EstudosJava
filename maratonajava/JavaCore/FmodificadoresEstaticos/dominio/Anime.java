package Jubs.Project.maratonajava.JavaCore.FmodificadoresEstaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;



    //bloco de inicialização static é executado quando a JVM carregar a classe
    //1 -aloca espaço na memoria pro objeto
    //2 cada atributo e classe é criado e inicializado com valores default ou o que for
    //3-bloco de inicialização é executado
    //4- construtor é executado

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios= new int [100];
        for(int i = 0 ; i < episodios.length;i++){
            episodios[i]=i+1;
        }
    }




    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){


        for(int episodio : Anime.episodios){
            System.out.print(episodio+ " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
