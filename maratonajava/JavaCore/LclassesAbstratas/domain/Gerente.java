package Jubs.Project.maratonajava.JavaCore.LclassesAbstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public void calculaBonus() {
        this.salario = this.salario + salario*0.2;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
