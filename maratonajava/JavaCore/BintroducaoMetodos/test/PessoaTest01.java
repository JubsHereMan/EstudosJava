package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.test;

import Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();


        //agora é possivel por chamarmos o metodo Set
        pessoa.setNome("Jiraya");
        pessoa.setIdade(80);


        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        // pessoa.imprimir();
    }
}
