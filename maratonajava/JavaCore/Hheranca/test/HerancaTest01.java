package Jubs.Project.maratonajava.JavaCore.Hheranca.test;

import Jubs.Project.maratonajava.JavaCore.Hheranca.domain.Endereco;
import Jubs.Project.maratonajava.JavaCore.Hheranca.domain.Funcionario;
import Jubs.Project.maratonajava.JavaCore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Sawada Tsuna");
        pessoa.setCpf("11111111111");
        
        //estou fazendo o relacionamento aqui
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Oda Nobunaga");

        funcionario.setCpf("22222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("===========================");
        funcionario.imprime();
    }
}
