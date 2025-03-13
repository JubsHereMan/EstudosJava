package Jubs.Project.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
//dado o valor de um carro descubra quantas vezes ele consegue ser parcelado
//condição é que valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal= 30000;

        for(int parcela =1; parcela <= valorTotal; parcela++ ){
            double valorParcela = valorTotal / parcela;
                if (valorParcela >= 1000){
                    System.out.println("Parcela "+ parcela+ valorParcela);
                }else{
                    break;
                }
            System.out.println("fora do if, mas dentro do for ");
        }

    }
}
