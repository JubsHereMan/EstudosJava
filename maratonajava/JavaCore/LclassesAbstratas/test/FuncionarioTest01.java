package Jubs.Project.maratonajava.JavaCore.LclassesAbstratas.test;


import Jubs.Project.maratonajava.JavaCore.LclassesAbstratas.domain.Desenvolvedor;
import Jubs.Project.maratonajava.JavaCore.LclassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
    Gerente gerente = new Gerente("Nami", 15000);
    Desenvolvedor dev = new Desenvolvedor("Katsuragi", 10000);
        System.out.println(gerente);
        System.out.println(dev);
    }
}
