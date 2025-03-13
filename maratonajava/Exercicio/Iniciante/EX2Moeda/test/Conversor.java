package Jubs.Project.maratonajava.Exercicio.Iniciante.EX2Moeda.test;

import Jubs.Project.maratonajava.Exercicio.Iniciante.EX2Moeda.domain.Cliente;
import Jubs.Project.maratonajava.Exercicio.Iniciante.EX2Moeda.domain.Moedas;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {


        //setando os atributos do cliente
        Cliente cliente = new Cliente();
        Moedas m = new Moedas();
        Scanner input = new Scanner(System.in);


        System.out.println("============================");
        System.out.println("Digite o nome do cliente: ");
        String nome = input.nextLine();
        cliente.setNome(nome);
        System.out.println("============================");
        System.out.println("Digite o valor monetário adquirido: ");
        double dinheiro = input.nextDouble();
        cliente.setDinheiro(dinheiro);
        System.out.println("============================");
        System.out.println("informações do cliente: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Valor: " + cliente.getDinheiro());


        //conversor

        System.out.println("para qual moeda você gostaria de converter o seu dinheiro " + cliente.getNome()+"?");
        System.out.println("1- DOLAR");
        System.out.println("2- EURO");
        System.out.println("3- YEN");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("============================");
                System.out.println("Seu dinheiro: R$" + cliente.getDinheiro());
                System.out.println("Valor da moeda escolhida: "+ m.getDolar() );
                System.out.println("valor da conversão");
                System.out.println(cliente.getDinheiro() / m.getDolar());
                break;
            case 2:
                System.out.println("============================");
                System.out.println("Seu dinheiro: R$" + cliente.getDinheiro());
                System.out.println("Valor da moeda escolhida: "+ m.getEuro() );
                System.out.println("valor da conversão");
                System.out.println(cliente.getDinheiro() / m.getEuro());
                break;
            case 3:
                System.out.println("============================");
                System.out.println("Seu dinheiro: R$" + cliente.getDinheiro());
                System.out.println("Valor da moeda escolhida: "+ m.getYen() );
                System.out.println("valor da conversão");
                System.out.println(cliente.getDinheiro() / m.getYen());
                break;

        }





    }
}
