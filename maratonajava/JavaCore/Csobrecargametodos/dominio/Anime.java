package Jubs.Project.maratonajava.JavaCore.Csobrecargametodos.dominio;

public class Anime {
    //declarando os atributos
    private String nome;
    private String tipo;
    private int episodo;
    private String genero;




    // aqui estou fazendo um metodo que vai inicializar tudo o que eu tenho
    public void init(String nome, String tipo, int episodo) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodo = episodo;

    }

    //sobrecarga de metodo
    public void init(String nome, String tipo, int episodo, String genero) {
        this.init(nome,tipo,episodo);
        this.genero = genero;
    }



    //imprimindo as informações passadas
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodo);
        System.out.println(this.genero);
    }



    //fazendo os getters e setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodo(int episodo) {
        this.episodo = episodo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodo() {
        return episodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
