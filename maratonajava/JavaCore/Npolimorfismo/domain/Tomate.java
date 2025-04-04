package Jubs.Project.maratonajava.JavaCore.Npolimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO=0.06;
    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaTaxa() {
        System.out.println("calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }


    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
