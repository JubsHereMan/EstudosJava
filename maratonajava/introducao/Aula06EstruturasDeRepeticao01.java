package Jubs.Project.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for

        //trabalha com resultados em valores booleanos
        int count = 0;
        while(count <= 10){
            System.out.println(count);
            count++;
        }

        //a diferença do "DO WHILE" para o "WHILE" é que este só vai executar uma vez mesmo que a condição seja FALSO
        //então diferente do "WHILE" que vai repetir até aquilo virar VERDADEIRO
        do{
            System.out.println("dentro do do while");

        }while (count< 10);

        //     variavel de controle = i
        // i = 0
        // enquanto i < 10
        //soma +1 -> i
        for (int i = 0; i < 10; i++){
            System.out.println("for" +i);
        }


    }
}
