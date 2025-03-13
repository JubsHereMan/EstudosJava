package Jubs.Project.maratonajava.Exercicio.Intermediario.EX1Escola.domain;

public enum EstadoAluno {
    APROVADO (1, "APROVADO"),
    REPROVADO(2, "REPROVADO"),
    RECUPERACAO(3,"EM RECUPERAÇÃO");


    public final int VALOR;
    private String statusAluno;

    EstadoAluno(int VALOR, String statusAluno) {
        this.VALOR = VALOR;
        this.statusAluno = statusAluno;
    }
}
