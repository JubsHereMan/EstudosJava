package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio;


public class ImpressoraEstudante {
        public void imprime(Estudante estudante){
            System.out.println("______________________________");

            System.out.println(estudante.nome);
            System.out.println(estudante.idade);
            System.out.println(estudante.sexo);
        }
    }
