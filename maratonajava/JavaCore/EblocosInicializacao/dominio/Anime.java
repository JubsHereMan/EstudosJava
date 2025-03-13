package Jubs.Project.maratonajava.JavaCore.EblocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;



    //bloco de inicialização
    //1- Aloca espaço em memoria pro objeto
    //2-Cada atributo de classe é criado e incializado com valores default ou o que for passado
    //3- Bloco de inicialização é executado
    //4- construtor é executado
    //vvvvvvvvvvvvvvvvvvvvvv
    {
        System.out.println("Dentro do bloco de inicializacao");
        System.out.println(episodios);
        episodios= new int [100];
        for(int i = 0 ; i < episodios.length;i++){
            episodios[i]=i+1;
        }
    }




    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){


        for(int episodio : this.episodios){
            System.out.println(episodio+ " ");
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
