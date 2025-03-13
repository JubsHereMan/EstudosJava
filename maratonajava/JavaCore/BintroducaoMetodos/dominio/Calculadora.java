package Jubs.Project.maratonajava.JavaCore.BintroducaoMetodos.dominio;

public class Calculadora {
    // nada de retorno
    //       V
    public void somoDoisNumeros() {
        System.out.println(10 + 10);
        System.out.println("finalizando calculadoratest01");
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 10);
    }

    //AQUI COMEÇAMOS A TRABALHAR COM PARAMETROS
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }


    public double divideDoisNumeros(int num1, int num2) {
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumertos");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    //{DUAS MANEIRAS DE FAZER A MESMA COISA

    public void somaArray(int[] nums) {
        int soma = 0;
        for (int num : nums) {
            soma += num;
        }
        System.out.println("soma = " + soma);
    }


    public void somaVarArgs(int... nums) {
        int soma = 0;
        for (int num : nums) {
            soma += num;
        }
        System.out.println("soma = " + soma);
    }

//}
}



