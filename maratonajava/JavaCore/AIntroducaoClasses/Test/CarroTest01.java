package Jubs.Project.maratonajava.JavaCore.AIntroducaoClasses.Test;

import Jubs.Project.maratonajava.JavaCore.AIntroducaoClasses.Dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2  = new Carro();


        carro.nome ="Fusca Bala";
        carro.ano= 1969;
        carro.modelo= "Sport";

        carro2.ano= 1968;
        carro2.modelo= "GT 500";
        carro2.nome= "Mustang";

        System.out.println("Carro 01");
        System.out.println(carro.nome);
        System.out.println(carro.ano);
        System.out.println(carro.modelo);

        System.out.println("\ncarro2");

        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);

    }
}
