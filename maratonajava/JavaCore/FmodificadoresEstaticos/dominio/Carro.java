package Jubs.Project.maratonajava.JavaCore.FmodificadoresEstaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    // metodo estatico vai fazer o atributo pertencer a classe, ou seja todas as instancias vão ter o mesmo valor
    private  static double velocidadeLimite = 250;


    public Carro(String nome, double velocidadeMaxima ) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime(){
        System.out.println("------------------------");
        System.out.println("nome: " + this.nome);
        System.out.println("velocidadeMaxima: " + this.velocidadeMaxima);
        System.out.println("velocidadeLimite: " + Carro.velocidadeLimite);
    }


     public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }}

