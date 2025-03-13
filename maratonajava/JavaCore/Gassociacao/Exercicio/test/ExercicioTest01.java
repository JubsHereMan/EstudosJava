package Jubs.Project.maratonajava.JavaCore.Gassociacao.Exercicio.test;

import Jubs.Project.maratonajava.JavaCore.Gassociacao.Exercicio.dominio.Aluno;
import Jubs.Project.maratonajava.JavaCore.Gassociacao.Exercicio.dominio.Local;
import Jubs.Project.maratonajava.JavaCore.Gassociacao.Exercicio.dominio.Professor;
import Jubs.Project.maratonajava.JavaCore.Gassociacao.Exercicio.dominio.Seminario;

public class ExercicioTest01 {
    public static void main(String[] args) {

        //locais
        Local local = new Local("Pavilhão A ");
        Local local2 = new Local("Pavilão B ");
        Local local3 = new Local("Pavilão C ");

        //aluno pendencias
        Aluno aluno = new Aluno("Júlio",21);
        Aluno aluno2 = new Aluno("Nicolas",20);
        Aluno aluno3 = new Aluno("Caue",20);
        Aluno aluno4 = new Aluno("Maria",20);
        Aluno aluno5 = new Aluno("João",19);
        Aluno aluno6 = new Aluno("Julian",20);

        Aluno[] grupo1 = {aluno,aluno3};
        Aluno[] grupo2 = {aluno2,aluno4};
        Aluno[] grupo3 = {aluno6,aluno5};


        Aluno[] alunos ={aluno,aluno2,aluno3,aluno4,aluno5,aluno6};


        //professores
        Professor professor = new Professor("Marcelo","Filosofia");
        Professor professor2 = new Professor("Daniela", "Matematica");
        Professor professor3 = new Professor("Daniel", "Geografia");


        //seminarios
        Seminario seminario = new Seminario("A arte da paz",grupo1,local);
        Seminario seminario2 = new Seminario("Algebra avançada",grupo2,local2);
        Seminario seminario3 = new Seminario("O mundo todo em uma regua",grupo3,local3);

        Seminario[] seminariosDisponiveis= {seminario};


        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();



//notas
        //eu não consegui fazer as exceções por enquanto
        //vou ver a aula e tentar novamente

//notas 2
        // eu sou um imbecil, e com menos de 3 minutos vendo o video eu matei como fazer
    }
//nota 3
    // eu continuo sendo um imbecil

//nota 4
    //não vc não foi um imbecil só fez de outro jeito fica paz     
}
