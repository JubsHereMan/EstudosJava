package Jubs.Project.maratonajava.Exercicio.Iniciante.EX2Moeda.domain;

public class Cliente {
    private String nome;
    private double dinheiro;

//construtor vazio para poder iniciar a operação sem numeros
    public Cliente() {
    }

    //porem manter os numeros necessarios
    public Cliente(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }


}


