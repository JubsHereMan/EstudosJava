package Jubs.Project.maratonajava.JavaCore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;



    public Escola(String nome) {
        this.nome = nome;
    }

    //sobrecarga de construtor
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(professores == null){
            return;
        }
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }

    }
    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return professores;
    }

    public void setProfessor(Professor[] professor) {
        this.professores = professor;
    }
}
