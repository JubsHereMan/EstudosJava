package Jubs.Project.maratonajava.Exercicio.Intermediario.EX1Escola.domain;

public class Aluno {

    private String nome;
    private double[] nota= new double[4];



    public Aluno() {
    }

    public Aluno(String nome, double[] nota) {
        this.nome = nome;
        this.nota = nota;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public double calcularMedia() {
        double somaNotas = nota[0] + nota[1] + nota[2] + nota[3];
        double media = somaNotas / getNota().length;
        System.out.println("a media do aluno é : " + media);
        return media;
    }



}
