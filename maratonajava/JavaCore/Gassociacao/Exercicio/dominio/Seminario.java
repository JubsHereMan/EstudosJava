package Jubs.Project.maratonajava.JavaCore.Gassociacao.Exercicio.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;



    //necessario para essa classe 1
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    // Overload
    public Seminario(String titulo, Local local) {
        this.titulo = titulo;

        this.local = local;
    }

    //overload final
    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;

        this.local = local;
    }


//isso ficou inutil

//    public void imprime(){
//
//        if(alunos == null)return;
//        if(local == null)return;
//
//        System.out.println("-----------Seminário----------------");
//        System.out.println(this.titulo);
//
//        System.out.println("---------Alunos-------------");
//        for(Aluno aluno : alunos){
//            System.out.println(aluno.getNome());
//        }
//
//
//
//        System.out.println("-----------local----------------");
//        System.out.println(local.getLocal());
//    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
