package Jubs.Project.maratonajava.JavaCore.Kenumeracao.domain;

public enum TipoCliente {

    PESSOA_FISICA(1, "pessoa fisica"),
    PESSOA_JURIDICA(2, "pessoa Juridica"),;

    public final int VALOR;
    private String nomeRelatorio;


    TipoCliente(int VALOR, String nomeRelatorio) {
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }


//    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
//
//    }


    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
}
