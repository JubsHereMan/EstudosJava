package Jubs.Project.maratonajava.JavaCore.Hheranca.test;

import Jubs.Project.maratonajava.JavaCore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    //0-Bloco de inicialização estatico da superclasse é executado quando a JVM abre
    //1- Bloco de inicialização estatico da subclasse é executado quando a JBM carrega
    //2 - alocando espaco em memória pra objeto da superclasse
    //4-Bloco de inicicalização da suplerclasse é executado na ordem em que aparece
    //5- construtor é executado na superclasse
    //6- alocado espaço em memoria pro objeto da subclasse
    //7-cada atributo de sublasse é criado e inicializado com valores default
    //8- Bloco de inicialização da sublassse é executado na ordem em que aparece
    //9- Construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ichigo");
    }
}
