package Jubs.Project.maratonajava.Exercicio.Iniciante.EX1Calc.domain;

public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    public int somaNumeros(){
        System.out.println("==========================================");
        System.out.println("Aqui está o resultado da soma dos numeros " + num1 +" E "+ num2);
        return num1 +num2;
    }

    public int subtraiNumeros(){
        System.out.println("=========================================");
        System.out.println("Aqui está o resultado da subtração dos numeros " + num1 +" E "+ num2);
        return num1 -num2;

    }

    public int multiplicaNumeros(){
        System.out.println("=========================================");
        System.out.println("Aqui está o resultado da multiplicação dos numeros " + num1 +" E "+ num2);
        return num1 * num2;

    }


    public double divideNumeros() {
        System.out.println("==========================================");
        System.out.println("Aqui está o resultado da divisão dos numeros " + num1 + " E " + num2);
            if(num2 ==0){
                System.out.println("Erro: divisão por zero não é permitida");
                return Double.NaN; // Retorna um valor especial indicando erro
            }
        return (double) num1 / num2;


    }

}
