package Jubs.Project.maratonajava.JavaCore.JmodificadorFinal.dominio;

public  class Carro {
    private String nome;
    //não quer que mude algo coloque "Final" não vai alterar até para o codigo
    public static final double VELOCIDADE_LIMITE= 250;
    public final Comprador COMPRADOR= new Comprador();//Estou falando que a referencia que esse atributo tem
    //não pode nunca ser alterada



public final void imprimir(){
    System.out.println(this.nome);
}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
