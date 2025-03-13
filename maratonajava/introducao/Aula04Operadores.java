package Jubs.Project.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //operadores que nós temos: +(soma),-(subtração),/(divisão),*(Multiplicação)
        int num1 = 10;
        int num2 = 20;
        double result = num1 * num2;
        System.out.println(result);


        // "%" ------------> operador de Resto(pega o restante)

        int resto = 21 % 2;
        System.out.println(resto);


        // operadores logicos ------------------>  sempre retornam booleanos
        // <(menor que ), >(maior que ),  <=(menor ou igual que ),  >=(maior ou igual que ), == (comparando), != (diferente de)

        boolean isDezMaior = 10 > 30;
        boolean isDezMenor = 10 < 30;
        boolean isDezIgual = 10 == 10;
        boolean isDezDiferente = 10 != 30;
        boolean isDezMenorIgual = 10 <= 30;
        boolean isDezMaiorIgual = 10 >= 30;


        System.out.println(isDezMaior);
        System.out.println(isDezMenor);
        System.out.println(isDezIgual);
        System.out.println(isDezDiferente);
        System.out.println(isDezMaiorIgual);
        System.out.println(isDezMenorIgual);



        /*operadores logicos
             &&(AND)
             || (or)
             !(negação("logical not"))

        */
        // AND
        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Estou dentro da lei para menor de 30 " + isDentroDaLeiMenorQueTrinta);
        System.out.println("Estou dentro da lei para maior de 30 " + isDentroDaLeiMaiorQueTrinta);


        // || (OU/OR)


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;

        float valorPS5 = 5000F;
        //                                                          OU
        boolean isPS5Compravel = valorTotalContaCorrente > valorPS5 || valorTotalContaPoupanca > valorPS5;
        System.out.println("O PS5 é compravel? " + isPS5Compravel);



        //OPRADORES DE ATRIBUIÇÃO ---------> =, +=, -=, /=, %=

        double bonus  = 1800;
        bonus +=1000;// 2800
        bonus -= 100; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %=2;
        System.out.println(bonus);


        // ++ --

        int contador = 0;
        contador +=1; // contador = contador + 1
        contador ++; //contador = contador + 1
        contador --;// contador = contador - 1
        System.out.println(contador);

    }

}
