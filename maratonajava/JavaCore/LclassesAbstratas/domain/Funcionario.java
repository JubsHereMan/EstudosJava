package Jubs.Project.maratonajava.JavaCore.LclassesAbstratas.domain;

//com classes abstratas trabalhamos com algo como se fosse um template
public abstract class Funcionario {
    protected String nome;
    protected double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

}
