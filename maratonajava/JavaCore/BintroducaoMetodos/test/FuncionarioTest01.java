package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.test;

import Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Naruto");
        funcionario.setIdade(23);
        //LOGICA DO PROFESSOR
        funcionario.setSalarios(new double[]{1200,9873.32,2000}); //CARALHO DA PRA FAZER ASSIM



//              MEU CODIGO QUE DEU CERTO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        double[] salario = {10000,3000,2000};
//        salario[0] = 10000;
//        salario[1] = 2000;
//        salario[2] = 3000;
//

//        System.out.println("Os Salarios são: "+  salario[0] + " e " + salario[1] + " e " + salario[2] );
//
//        double soma = funcionario.somaDados(salario[0], salario[1], salario[2] );
//        System.out.println("A soma dos salarios é: "+ soma);
//
//        double media = funcionario.pegaMedia(soma);
//        System.out.println("A media do salario de " + funcionario.nome + " É: "+ media);






      
        funcionario.imprimir();
        funcionario.imprimeMediaSalarial();

    }
}
