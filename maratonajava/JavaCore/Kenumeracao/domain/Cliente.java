package Jubs.Project.maratonajava.JavaCore.Kenumeracao.domain;

public class Cliente {


    private String nome;
    private TipoCliente TipoCliente;
    private TipoPagamento tipoPagamento;


    public Cliente(String nome, Jubs.Project.maratonajava.JavaCore.Kenumeracao.domain.TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        TipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", TipoCliente=" + TipoCliente +
                ", TipoClienteInt=" + TipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
