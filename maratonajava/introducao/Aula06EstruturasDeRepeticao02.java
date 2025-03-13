package Jubs.Project.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    /*
    imprima tos os numeros pares de 0 ate  1000000

    NÓS AINDA NÃO SABEMOS O QUE O STATIC FAZ!
    porem conseguimos fazer algo alem do exercicio
    consegumos juntar em grupos impares e pares

    POREM COMPANHEIROS IREMOS ENTENDER COMO STATIC FUNFA SIMBORA
    */
    static int  countPair= 0;
    static int  countOdd = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++){
            if(i % 2 == 0){
                countPair++;
            }else{
                countOdd++;
            }
        }
        System.out.println(countPair);
        System.out.println(countOdd);
    }
}
