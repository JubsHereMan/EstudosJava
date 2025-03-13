package Jubs.Project.maratonajava.introducao;

public class Aula05Exercicio {
    public static void main(String[] args) {

        double salario = 6000;

        if (salario > 1000 && salario <= 1500) {
            System.out.println(salario/9.5 + " O seu salario foi taxado nesse valor.");
        }else if (salario > 1500 && salario <= 2000) {
            System.out.println(salario/15.3 + " O seu salario foi taxado nesse valor.");
        }else if (salario > 2000 && salario <= 3000) {
            System.out.println(salario/23.4 + " O seu salario foi taxado nesse valor.");
        }else if (salario > 3000) {
            System.out.println(salario/30.5 +" O seu salario foi taxado nesse valor.");
        }else{
            System.out.println("O seu salario não sera taxado.");

        }

    }
}
